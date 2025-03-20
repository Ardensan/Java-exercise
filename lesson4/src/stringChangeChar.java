public class stringChangeChar {
    public static void main(String[] args) {
        char[] cs="hello".toCharArray();
        String s=new String(cs);
        System.out.println(s);
        cs[0]='x';
        System.out.println(s);
    }
}
