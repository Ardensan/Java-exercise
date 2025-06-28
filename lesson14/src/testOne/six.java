package testOne;

class oneRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("one线程开始了");
    }
}
class twoRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("two线程开始了");
    }
}
public class six {
    public static void main(String[] args) {
        Thread t=new Thread(new oneRunnable());
        Thread d=new Thread(new twoRunnable());
        d.start();
        try{d.join();}catch (Exception e){}
        t.start();
        System.out.println(Thread.currentThread().getPriority());
    }
}
