package testOne;

public class five {
    public static void main(String[] args) {
        System.out.println("主线程开始");
        Thread t=new Thread(){
            public void run(){
                System.out.println("线程开始");
                try{
                    Thread.sleep(4000);
                }catch (Exception e){}
                System.out.println("线程结束");
            }
        };
        t.start();
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        System.out.println("主线程结束");
    }
}
