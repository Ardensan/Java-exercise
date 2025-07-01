package testTwo;

public class three {
    public static void main(String[] args) throws Exception {
        Thread t=new Thread(()->{
            System.out.println("线程要启动啊");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println("主线程start");
        t.start();
        t.join();
        System.out.println("主线程结束");
    }
}
