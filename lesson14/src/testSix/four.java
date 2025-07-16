package testSix;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class four {
    private final ReentrantLock lock=new ReentrantLock();
    private int counter=0;
    // 演示基本的加锁和解锁
    public void basicLockExample(){
        lock.lock();
        try{
            counter++;
            System.out.println(counter);
            recursiveMethod(3);
        }finally {
            lock.unlock();
        }
    }
    // 演示可重入性
    public void recursiveMethod(int n){
        if(n<=0){return;}
        lock.lock();
        try{
            System.out.println("递归调用"+n+"当前锁持有次数"+lock.getHoldCount());
            recursiveMethod(n-1);
        }finally {
            lock.unlock();
        }
    }
    // 演示 tryLock 超时机制
    public void tryLockWithTimeout(int id){
        try{
            if(lock.tryLock(2, TimeUnit.SECONDS)){
                try{
                    System.out.println(id + "成功获取锁，执行业务逻辑..");
                    Thread.sleep(1000);
                }
                finally {
                    lock.unlock();
                }
            }else{
                System.out.println(id + "获取锁超时，执行备用逻辑...");
            }
        }catch (InterruptedException e){
            System.out.println(id + "线程中断");
        }
    }
    // 演示 tryLock 非阻塞获取锁
    public void tryLOckNonBlocking(int id){
        if(lock.tryLock()){
            try{
                System.out.println(id + "立刻获取锁");
                counter++;
            }finally {
                lock.unlock();
            }
        }else {
            System.out.println(id +"锁被占用，执行其他逻辑");
        }
    }
    // 演示可中断的锁获取
    public void interruptibleLock(){
        try{
            lock.lockInterruptibly();
            try{
                System.out.println("获取到可中断的锁");
                Thread.sleep(2000);
            }finally {
                lock.unlock();
            }
        }catch (InterruptedException e){
            System.out.println("线程在等待时候锁被中断");
        }
    }
    // 多线程演示
    public static void main(String[] args) throws InterruptedException{
        four demo=new four();
        System.out.println("===基本锁演示===");
        demo.basicLockExample();

        System.out.println("===多线程演示===");
        Thread[] threads=new Thread[3];
        for(int i=0;i<3;i++){
            final int ID=i;
            threads[i]=new Thread(()->{
                System.out.println("线程"+ ID +"开始执行");
                demo.tryLockWithTimeout(ID);
                demo.tryLOckNonBlocking(ID);
            });
            threads[i].start();
        }
        // 等待所有线程完成
        for(Thread thread:threads){
            thread.join();
        }
        System.out.println("==中断演示==");
        Thread interruptThread=new Thread(()->{
            demo.interruptibleLock();
        });

        interruptThread.start();
        Thread.sleep(1000);
        interruptThread.interrupt();//中断线程
        interruptThread.join();
        System.out.println("最终计数器值:"+ demo.counter);

        // 锁的状态信息
        System.out.println("锁是否被持有: " + demo.lock.isLocked());
        System.out.println("当前线程持有锁次数: " + demo.lock.getHoldCount());
        System.out.println("等待队列长度: " + demo.lock.getQueueLength());
    }
}
