package testSeven;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class two {
    private static final Random random=new Random();
    private static void sleep(int ms){
        try{Thread.sleep(ms);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
    private static int calculateSync(String taskName,int sleepMs){
        System.out.println("同步计算的方法");
        System.out.println(taskName+"开始执行...");
        sleep(sleepMs);
        int result=random.nextInt(100)+1;
        System.out.println(taskName+"执行完成,结果"+result);
        return result;
    }
    private static int calculateAsync(String taskName,int sleepMs){
        System.out.println("异步计算的方法");
        System.out.println("["+Thread.currentThread().getName()+"]"+taskName+"开始执行");
        sleep(sleepMs);
        int result=random.nextInt(100)+1;
        System.out.println("["+Thread.currentThread().getName()+"]"+taskName+"执行完成，结果"+result);
        return result;
    }
    private static void synchronousDemo(){
        System.out.println("1.同步执行演示:");
        long startTime=System.currentTimeMillis();
        int result1=calculateSync("任务1",2000);
        int result2=calculateSync("任务2",1500);
        int result3=calculateSync("任务3",1000);
        long endTime=System.currentTimeMillis();
        System.out.println("同步执行总耗时:"+(endTime-startTime)+"ms");
        System.out.println("结果:"+result1+","+result2+","+result3);
    }
    private static void asynchronousDemo(ExecutorService executor){
        System.out.println("2.异步执行演示");
        long startTime=System.currentTimeMillis();
        try{
            Future<Integer> future1=executor.submit(()->calculateAsync("异步任务1",2000));
            Future<Integer> future2=executor.submit(()->calculateAsync("异步任务2",1500));
            Future<Integer> future3=executor.submit(()->calculateAsync("异步任务3",1000));
            System.out.println("任务已提交，做其他事情");
            //模拟做其他工作
            Thread.sleep(500);
            System.out.println("做了500ms的其他工作");

            int result1=future1.get();
            int result2=future2.get();
            int result3=future3.get();

            long endTime=System.currentTimeMillis();
            System.out.println("同步执行总耗时:"+(endTime-startTime)+"ms");
            System.out.println("结果:"+result1+","+result2+","+result3);
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("=== Java Future 同步异步演示 ===\n");
        ExecutorService executor= Executors.newFixedThreadPool(4);
        try{
            synchronousDemo();
            System.out.println("\n" + "=".repeat(50) + "\n");
            asynchronousDemo(executor);
            System.out.println("\n" + "=".repeat(50) + "\n");
        }finally {executor.shutdown();
        }
    }
}
