package testSix;

class Counter{
    public static final Object lock1=new Object();
    public static final Object lock2=new Object();
    public static int count=0;
}

class add extends Thread{
    private int n;
    public add(int n){
        this.n=n;
    }
    public void run(){
        synchronized (Counter.lock1){
            Counter.count+=n;
            synchronized (Counter.lock2){
                Counter.count+=n;
            }
        }
    }
}

class dec extends Thread{
    private int n;
    public dec(int n){
        this.n=n;
    }
    public void run(){
        synchronized (Counter.lock2){
            Counter.count-=n;
            synchronized (Counter.lock1){
                Counter.count-=n;
            }
        }
    }
}

public class one {
    public static void main(String[] args) throws Exception {
        add test=new add(3);
        test.start();
        //test.join();
        dec t=new dec(1);
        t.start();
        //t.join();
        System.out.println(Counter.count);
    }
}
