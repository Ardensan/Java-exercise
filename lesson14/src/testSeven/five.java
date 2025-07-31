package testSeven;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class five {
    static String queryCode(String name,String url){
        System.out.println("query code from"+ url + "...");
        try{Thread.sleep((long)(Math.random()+100));
        }catch (InterruptedException e){}
        return "601857";
    }
    static Double fetchPrice(String code,String url){
        System.out.println("query code from"+ url + "...");
        try{Thread.sleep((long)(Math.random()+100));
        }catch (InterruptedException e){}
        return 5+Math.random()*20;
    }
    public static void main(String[] args) throws Exception {
        // 两个CompletableFuture执行异步查询:
        CompletableFuture<String> cfQueryFromSina=CompletableFuture.supplyAsync(()->{
            return queryCode("中国石油","https://finance.sina.com.cn/code/");});
        CompletableFuture<String> cfQueryFrom163=CompletableFuture.supplyAsync(()->{
            return queryCode("中国石油","https://money.163.com/code/");});
        // 用anyOf合并为一个新的CompletableFuture:
        CompletableFuture<Object> cfQuerys=CompletableFuture.anyOf(cfQueryFromSina,cfQueryFrom163);
        System.out.println(cfQuerys.get());
        // 这里是吧接受到的结果再异步查询
        CompletableFuture<Double> cfFetchFromSina=cfQuerys.thenApplyAsync((code)->{
            return fetchPrice((String)code,"https://finance.sina.com.cn/price/");});
        CompletableFuture<Double> cfFetchFrom163=cfQuerys.thenApplyAsync((code)->{
            return fetchPrice((String)code,"https://money.163.com/price/");});
        // 用anyOf合并为一个新的CompletableFuture:
        CompletableFuture<Object> cfFetch=CompletableFuture.anyOf(cfFetchFromSina,cfFetchFrom163);
        if(CompletableFuture.allOf(cfFetchFromSina,cfFetchFrom163).get()==null){
            System.out.println("已完成");
        }
        cfFetch.thenAccept((result)->{
            System.out.println("price:"+result);
        });
        // 主线程不要立刻结束，否则CompletableFuture默认使用的线程池会立刻关闭:
        Thread.sleep(200);
    }
}