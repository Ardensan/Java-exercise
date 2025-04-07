package SuperFanxing;
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
    public void setFirst(T first){
        this.first=first;}
    public void setLast(T last){
        this.last=last;}
}
public class Main {
    public static void main(String[] args) {
        Pair<Number> p1=new Pair<>(22.4,33.1);
        Pair<Integer> p2=new Pair<>(12,34);
        System.out.println(p1.getFirst()+ " "+ p1.getLast());
        System.out.println(p2.getFirst()+ " "+ p2.getLast());
        setSame(p1,55);
        System.out.println(p1.getFirst()+ " "+ p1.getLast());
    }
    static void setSame(Pair<? super Integer> p,Integer n){
        p.setFirst(n);
        p.setLast(n);
    }
}
