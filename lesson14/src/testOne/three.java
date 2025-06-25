package testOne;

class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("开始新的线程");
    }
}
public class three {
    public static void main(String[] args) {
        Thread t=new Thread(new MyRunnable());
        t.start();
    }
}
