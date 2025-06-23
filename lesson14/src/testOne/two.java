package testOne;
class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("开始新线程");
    }
}
public class two {
    public static void main(String[] args) {
        Thread t=new MyThread();
        t.start();
    }
}
