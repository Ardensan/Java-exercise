package testSix;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class eight {
    private static final Semaphore tables=new Semaphore(3);
    public static void dineAt(String customerName){
        try{
            System.out.println(customerName+ "到达餐厅");
            // 尝试获取（许可证）
            tables.acquire();
            System.out.println(customerName+"获得餐桌，开始用餐,当前可用桌子数是:"+tables.availablePermits());
            // 模拟用餐时间（1-3秒）
            int diningTime= ThreadLocalRandom.current().nextInt(1,4);
            TimeUnit.SECONDS.sleep(diningTime);
            System.out.println(customerName+"用餐完毕，离开餐厅");
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println(customerName+"被中断");
        }finally {
            // 释放餐桌（许可证）
            tables.release();
            System.out.println(customerName+"释放餐桌，当前可用餐桌数是:"+tables.availablePermits());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== 餐厅开业拉 ===");
        String[] customers={"张三", "李四", "王五", "赵六", "孙七",
                "周八", "吴九", "郑十", "冯十一", "陈十二"};
        for(String customer:customers){
            new Thread(()->dineAt(customer)).start();
            TimeUnit.MILLISECONDS.sleep(200);
        }
        TimeUnit.SECONDS.sleep(15);
        System.out.println("\n=== 最终状态 ===");
        System.out.println("可用桌子数: " + tables.availablePermits());
        System.out.println("等待用餐的客人数: " + tables.getQueueLength());
    }
}
