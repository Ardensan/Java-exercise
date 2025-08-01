package testEight;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
//Long 是对象引用类型
class SumTask extends RecursiveTask<Long>{
    static final int THRESHOLD=500;
    long[] array;
    int start;
    int end;
    SumTask(long[] array,int start,int end){
        this.array=array;
        this.start=start;
        this.end=end;
    }
    @Override
    protected Long compute(){
        if(end - start <=THRESHOLD){
            // 如果任务足够小,直接计算:
            long sum=0;
            for(int i=start;i<end;i++){
                sum+=this.array[i];
                try {
                    Thread.sleep(1);
                }catch (InterruptedException e){
                }
            }
            return sum;
        }
        int middle=(end+start)/2;
        System.out.println(String.format("split %d~%d ==> %d~%d,%d~%d",start,end,start,middle,middle,end));
        SumTask subtask1=new SumTask(this.array,start,middle);
        SumTask sumTask2=new SumTask(this.array,middle,end);
        invokeAll(subtask1,sumTask2);
        Long subresult1=subtask1.join();
        Long subresult2=sumTask2.join();
        Long result=subresult1+subresult2;
        System.out.println("result= "+ subresult1+ " + " +subresult2+" ==> "+result);
        return result;
    }
}

public class one {
    //0表示种子
    static Random random=new Random(0);
    static long random(){
        return random.nextInt(10000);
    }
    public static void main(String[] args) {
        long[] array=new long[2000];
        long expectedSum=0;
        System.out.println(random());
        for(int i=0;i<array.length;i++){
            array[i]=random();
            expectedSum+=array[i];
        }
        System.out.println("expectedSum:"+expectedSum);
        ForkJoinTask<Long> task=new SumTask(array,0,array.length);
        long startTime=System.currentTimeMillis();
        Long result=ForkJoinPool.commonPool().invoke(task);
        long endTime=System.currentTimeMillis();
        System.out.println("Fork/join sum: "+result+" in "+(endTime-startTime)+"ms");
    }
}
