package testThree;
class HelloThread1 extends Thread{
    public volatile boolean running = true;
    public void run(){
        int n=0;
        while(running){
            n++;
            System.out.println(n+"计数");
        }
        System.out.println("end");
    }
}
public class three {
    public static void main(String[] args) throws Exception {
        HelloThread1 t=new HelloThread1();
        t.start();
        System.out.println(t.isInterrupted());
        Thread.sleep(3);
        t.running=false;
        System.out.println(t.isInterrupted());
    }
}
