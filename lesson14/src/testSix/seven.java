package testSix;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.StampedLock;

class point{
    private final StampedLock stampedLock=new StampedLock();
    private double x;
    private double y;
    public point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public void move(double deltaX,double deltaY){
        long stamp=stampedLock.writeLock();
        try{
            x+=deltaX;
            y+=deltaY;
        }finally {
            stampedLock.unlockWrite(stamp);
        }
    }
    public double distanceFromOrigin(){
        long stamp=stampedLock.tryOptimisticRead();
        double currentX=x;
        double currentY=y;
        if(!stampedLock.validate(stamp)){
            stamp=stampedLock.readLock();
            try{
                currentX=x;
                currentY=y;
            }finally {
                stampedLock.unlockRead(stamp);
            }
        }
        return Math.sqrt(currentX*currentX+currentY*currentY);
    }
    public String getCoordinates(){
        long stamp=stampedLock.tryOptimisticRead();
        double currentX=x;
        double currentY=y;
        if(!stampedLock.validate(stamp)){
            stamp=stampedLock.readLock();
            try{
                currentX=x;
                currentY=y;
            }finally {
                stampedLock.unlockRead(stamp);
            }
        }
        return String.format("(%.2f,%.2f)",currentX,currentY);
    }
}

public class seven {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("多线程的状态使用:");
        point test=new point(0.0,0.0);
        ExecutorService executor= Executors.newFixedThreadPool(4);
        //启动多个写线程
        for(int i=0;i<3;i++){
            final int threadID=i;
            executor.submit(()->{
               for(int j=0;j<100;j++){
                   test.move(0.1,0.1);
                   if(j%20==0){
                       System.out.println("写线程"+threadID+"-位置:"+test.getCoordinates());
                   }
               }
            });
        }
        //启动多个读线程
        for(int i=0;i<2;i++){
            final int threadID=i;
            executor.submit(()->{
                for(int j=0;j<100;j++){
                    if(j%20==0){
                        System.out.println("读线程"+threadID+"-距离:"+test.distanceFromOrigin());
                    }
                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
            });
        }
        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("最终位置"+test.getCoordinates());
        System.out.println("最终距离原点的位置"+test.distanceFromOrigin());
    }
}
