package testThree;
class HelloThread extends Thread{
    public void run(){
        int n=0;
        while (!isInterrupted()){
            n++;
            System.out.println(n+"计数");
            try{Thread.sleep(100);
            }catch (InterruptedException e){
                break;
            }
        }
    }
}
class MyThreadOne extends Thread{
    public void run(){
        Thread hello=new HelloThread();
        hello.start();
        try{hello.join();
        }catch (InterruptedException e){
            System.out.println("InterruptedException异常了");
        }
        hello.interrupt();
    }
}
public class two {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new MyThreadOne();
        t.start();
        Thread.sleep(1000);
        t.interrupt();// 中断t线程
        t.join();// 等待t线程结束
        System.out.println("结束");
    }
}
