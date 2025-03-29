public class huoqufulei {
    public static void main(String[] args) {
        Class i=Integer.class;
//        System.out.println(i);
//        Class n=i.getSuperclass();
//        System.out.println(n);
//        Class o=n.getSuperclass();
//        System.out.println(o);
//        Class no=o.getSuperclass();
//        System.out.println(no);
        for(Class x = i; x != null; x = x.getSuperclass()) {
            System.out.println(x);
        }
    }
}
