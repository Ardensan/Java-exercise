package testSix;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class eleven {
    private static int normalCounter=0;
    private static AtomicInteger atomicInteger=new AtomicInteger(0);
    private static void basicAtomicOperations(){
        System.out.println("基本原子操作演示-即atomic包里面的方法应用");
        AtomicInteger counter=new AtomicInteger(1);
        System.out.println("初始值: " + counter.get());
        System.out.println("增加后: " + counter.incrementAndGet());
        System.out.println("减少后: " + counter.decrementAndGet());
        System.out.println("增加5后: " + counter.addAndGet(5));
        System.out.println("先获取再增加: " + counter.getAndIncrement());
        System.out.println("当前值: " + counter.get());
        System.out.println("=====分割线======");
    }
    private static void concurrencyTest() throws InterruptedException{
        System.out.println("并发安全性对比");
        int threadCount=100;
        int incrementsPerThread=1000;
        CountDownLatch latch=new CountDownLatch(threadCount);
        normalCounter=0;
        atomicInteger.set(0);
        for(int i=0;i<threadCount;i++){
            new Thread(()->{
                for(int j=0;j<incrementsPerThread;j++){
                    normalCounter++;
                    atomicInteger.incrementAndGet();
                }
                latch.countDown();
            }).start();
        }
        latch.await();
        int expectedValue=threadCount*incrementsPerThread;
        System.out.println("期望值："+expectedValue);
        System.out.println("普通counter结果"+normalCounter+"可能不准确");
        System.out.println("Atomic counter结果"+atomicInteger.get()+"准确数值");
        System.out.println("=====分割线======");
    }
    private static void casOperationDemo(){
        System.out.println("CAS操作演示:");
        AtomicInteger value=new AtomicInteger(100);
        boolean success1=value.compareAndSet(100,200);
        System.out.println("CAS(100->200): " + success1 + ", 当前值: " + value.get());
        boolean success2=value.compareAndSet(100,300);
        System.out.println("CAS(100->300): " + success2 + ", 当前值: " + value.get());
        boolean success3=value.compareAndSet(200,300);
        System.out.println("CAS(200->300): " + success3 + ", 当前值: " + value.get());

    }
    public static void main(String[] args) throws InterruptedException {
        basicAtomicOperations();
        concurrencyTest();
        casOperationDemo();
    }
}
