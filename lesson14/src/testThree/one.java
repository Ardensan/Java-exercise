package testThree;
//中断线程interrupt()
class MyThread extends Thread{
    public void run(){
        int n=0;
        while (!isInterrupted()){
            n++;
            System.out.println(n+"hello");
        }
    }
}
public class one {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new MyThread();
        t.start();
        Thread.sleep(4);
        t.interrupt();
        t.join();
        System.out.println("主线程结束");
    }
}
