package testFive;
class CounterTwo{
    public static final Object lock=new Object();
    public static int count=0;
}
class addThreadTwo extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            synchronized (CounterTwo.lock){
                CounterTwo.count+=1;}
        }
    }
}
class decThreadTwo extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            synchronized (CounterTwo.lock){
                CounterTwo.count+=1;}
        }
    }
}
public class two {
    public static void main(String[] args) throws Exception {
        var add=new addThreadTwo();
        var dec=new decThreadTwo();
        add.start();dec.start();
        add.join();dec.join();
        System.out.println(CounterTwo.count);
    }
}
