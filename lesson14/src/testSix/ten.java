package testSix;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ten {
    public static void demostrateConcurrentHashMap(){
        System.out.println("=== ConcurrentHashMap 演示 ===");
        ConcurrentHashMap<String, AtomicInteger> wordCount=new ConcurrentHashMap<>();
        String[] words={"java","python","java","c++","python","java","go","rust"};
        ExecutorService executor= Executors.newFixedThreadPool(4);
        for(String word:words){
            executor.submit(()->{
                wordCount.computeIfAbsent(word,k->new AtomicInteger(0)).incrementAndGet();
                System.out.println(Thread.currentThread().getName()+"处理单词"+word);
            });
        }
        executor.shutdown();
        try{
            executor.awaitTermination(5, TimeUnit.SECONDS);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println("单词统计结果：");
        wordCount.forEach((word,count)->
                System.out.println(word+":"+count.get()));
    }

    public static void main(String[] args) {
        demostrateConcurrentHashMap();

    }
}
