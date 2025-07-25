package testClaude;

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
        try {
            System.out.println("Add线程开始执行");
            synchronized (Counter.lock1){
                System.out.println("Add线程获取lock1");
                Counter.count+=n;

                // 增加延时，提高死锁概率
                Thread.sleep(100);

                System.out.println("Add线程尝试获取lock2");
                synchronized (Counter.lock2){
                    System.out.println("Add线程获取lock2");
                    Counter.count+=n;
                }
            }
            System.out.println("Add线程执行完成");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class dec extends Thread{
    private int n;
    public dec(int n){
        this.n=n;
    }
    public void run(){
        try {
            System.out.println("Dec线程开始执行");
            synchronized (Counter.lock2){
                System.out.println("Dec线程获取lock2");
                Counter.count-=n;

                // 增加延时，提高死锁概率
                Thread.sleep(100);

                System.out.println("Dec线程尝试获取lock1");
                synchronized (Counter.lock1){
                    System.out.println("Dec线程获取lock1");
                    Counter.count-=n;
                }
            }
            System.out.println("Dec线程执行完成");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class one {
    public static void main(String[] args) throws Exception {
        // 多次运行增加死锁概率
        for (int i = 0; i < 10; i++) {
            System.out.println("=== 第" + (i+1) + "次测试 ===");

            add test = new add(3);
            dec t = new dec(1);

            // 同时启动两个线程
            test.start();
            t.start();

            // 等待线程完成或超时
            test.join(1000);  // 最多等1秒
            t.join(1000);     // 最多等1秒

            if (test.isAlive() || t.isAlive()) {
                System.out.println("检测到死锁！线程未能正常结束");
                System.exit(1);
            }

            System.out.println("Counter.count = " + Counter.count);
            Counter.count = 0;  // 重置计数器

            Thread.sleep(50);  // 短暂休息
        }

        System.out.println("所有测试完成，未检测到死锁");
    }
}
