package testFour;

import java.time.LocalTime;

public class one {
    public static void main(String[] args) {
        Thread t=new Thread(()->{
           while(true){
               System.out.println(LocalTime.now());
               try{
                   Thread.sleep(1000);
               }catch (InterruptedException e){
                   System.out.println(e);
                   break;
               }
           }
        });
        t.start();
        t.interrupt();//线程中断
    }
}
