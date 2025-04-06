package ExtensFanxing;
class Pair<T>{
    private T first;
    private T last;
    public Pair(T first,T last){
        this.first=first;
        this.last=last;}
    public T getFirst(){
        return this.first;}
    public T getLast(){
        return this.last;}
}
public class Main {
    static int add(Pair<? extends Number> p){
        Number first=p.getFirst();
        Number last=p.getLast();
        return first.intValue()+last.intValue();
    }
    public static void main(String[] args) {
        Pair<Integer> a=new Pair<>(12,22);
        int p=add(a);
        System.out.println(p);
    }
}
