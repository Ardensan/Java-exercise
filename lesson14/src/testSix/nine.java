package testSix;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class nine {
    private static final Semaphore parkingSpace=new Semaphore(2);
    public static void parkCar(String name){
        try{
            System.out.println(name + "到达停车场");
            if(parkingSpace.tryAcquire(1, TimeUnit.SECONDS)){
                System.out.println(name+"停车成功,剩余停车位:"+parkingSpace.availablePermits());
                TimeUnit.SECONDS.sleep(ThreadLocalRandom.current().nextInt(2,5));
                System.out.println(name + "离开停车场");
            }else {
                System.out.println(name+"等待超时,离开停车场");
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            if(parkingSpace.availablePermits()<2){
                parkingSpace.release();
                System.out.println(name + "释放车位,剩余车位是"+parkingSpace.availablePermits());
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("停车场开始动了");
        String[] carNames={"奔驰","宝马","奥迪","丰田","本田"};
        for(String carName:carNames){
            new Thread(()->parkCar(carName)).start();
            TimeUnit.MILLISECONDS.sleep(1);
        }
        TimeUnit.SECONDS.sleep(10);
        System.out.println("停车场最终车位数: " + parkingSpace.availablePermits());
    }
}
