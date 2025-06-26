package testOne;

public class four {
    public static void main(String[] args) {
        Thread t=new Thread(()->{
            System.out.println("four,开始新的线程");
        });
        t.start();
    }
}
