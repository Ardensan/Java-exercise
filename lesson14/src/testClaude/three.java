package testClaude;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class MySumTask extends RecursiveTask<Long> {
    private final long start;
    private final long end;
    private static final int THRESHOLD = 10_000; // 任务分解的阈值

    public MySumTask(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        long length = end - start;
        if (length <= THRESHOLD) {
            // 基本情况：如果任务足够小，直接计算
            long sum = 0;
            for (long i = start; i < end; i++) {
                sum += i;
            }
            return sum;
        } else {
            // 递归情况：分解任务
            long mid = start + length / 2;
            MySumTask leftTask = new MySumTask(start, mid);
            MySumTask rightTask = new MySumTask(mid, end);

            // 使用 invokeAll() 同时启动左右两个子任务
            // invokeAll(leftTask, rightTask); // 也可以这样传递可变参数
            Collection<MySumTask> subTasks = new ArrayList<>();
            subTasks.add(leftTask);
            subTasks.add(rightTask);
            invokeAll(subTasks); // 也可以传递 Collection

            // 等待子任务完成并获取结果
            Long leftResult = leftTask.join();
            Long rightResult = rightTask.join();

            return leftResult + rightResult;
        }
    }
}
public class three {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        long totalSum = forkJoinPool.invoke(new MySumTask(0, 1_000_000));
        System.out.println("Total sum: " + totalSum);
        forkJoinPool.shutdown();
    }
}
