package testSix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class CounterTwo{
    private final ReadWriteLock rwlock= new ReentrantReadWriteLock();
    private final Lock rlock=rwlock.readLock();
    private final Lock wlock=rwlock.writeLock();
    private int[] counts=new int[10];
    public void include(int index){
        wlock.lock();
        try{
            counts[index]+=1;
        }finally {
            wlock.unlock();
        }
    }
    public int[] get(){
        rlock.lock();
        try{
            return Arrays.copyOf(counts,counts.length);
        }finally {
            rlock.unlock();
        }
    }
}

public class six {
    public static void main(String[] args) throws InterruptedException{
        CounterTwo couter=new CounterTwo();
        System.out.println("初始状态"+ Arrays.toString(couter.get()));
        // 创建5个线程来模拟多线程环境
        Thread[] threads=new Thread[5];
        // 线程1: 不断增加索引0-2的计数
        threads[0]=new Thread(()->{
            for(int i=0;i<100;i++){
                couter.include(i%3);
                //System.out.println("线程1开始写入了");
                try{
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        },"Writer-1");
        // 线程2: 不断增加索引3-5的计数
        threads[1]=new Thread(()->{
            for(int i=0;i<100;i++){
                couter.include(i%3 + 3);
                //System.out.println("线程2开始写入了");
                try{
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        },"Writer-2");
        // 线程3: 不断增加索引6-9的计数
        threads[2]=new Thread(()->{
            for(int i=0;i<100;i++){
                couter.include(i%4 + 6);
                //System.out.println("线程3开始写入了");
                try{
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        },"Writer-3");
        // 线程4: 读取线程1 - 不断读取并打印计数
        threads[3]=new Thread(()->{
            for(int i=0;i<20;i++){
                int[] counts=couter.get();
                System.out.println("读取线程1"+Arrays.toString(counts));
                try{
                    Thread.sleep(50);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        },"Reader-1");
        // 线程5: 读取线程2 - 不断读取并打印计数
        threads[4]=new Thread(()->{
            for(int i=0;i<20;i++){
                int[] counts=couter.get();
                System.out.println("读取线程2"+Arrays.toString(counts));
                try{
                    Thread.sleep(50);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        },"Reader-2");
        //启动所有线程
        for(Thread thread:threads){
            thread.start();
        }
        for(int i=0;i<50;i++){
            couter.include(i%10);
            if(i%10==0){
                System.out.println("主线程读取:"+Arrays.toString(couter.get()));
            }
            Thread.sleep(5);
        }
        for(Thread thread:threads){
            thread.join();
        }
        System.out.println("最终状态:"+Arrays.toString(couter.get()));
    }
}
