package cashi;
class pair<T>{
    private T someOne;
    public pair(T someOne) {this.someOne=someOne;}
    public T getSomeOne(){
        return this.someOne;}
}
public class Main {
    public static void main(String[] args) {
        pair<String> a=new pair<>("黄工");
        pair<Integer> b=new pair<>(22);
        Class a1=a.getClass();
        Class b1=b.getClass();
        System.out.println(a1==b1);
        System.out.println(pair.class);
        System.out.println(a1==pair.class&&b1==pair.class);
    }
}
