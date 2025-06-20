package testTwo;

public class three {
    public static void main(String[] args) {
        String s1="AaAaAa";
        String s2="BBAaBB";
        System.out.println("哈希相等"+(s1.hashCode()==s2.hashCode()));
        System.out.println("字符串不相等"+s1.equals(s2));
    }
}
