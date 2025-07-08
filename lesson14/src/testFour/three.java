package testFour;

import java.time.LocalTime;

//守护线程
public class three {
    public static void main(String[] args) throws InterruptedException {
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
        t.setDaemon(true);
        t.start();
        Thread.sleep(3000);
    }
}
