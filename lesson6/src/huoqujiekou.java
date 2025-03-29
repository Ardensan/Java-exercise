public class huoqujiekou {
    public static void main(String[] args) {
        Class s=Integer.class;
        Class[] is=s.getInterfaces();
        for(Class i:is){
            System.out.println(i);
        }
        Class ss=Integer.class.getSuperclass();
        Class[] es=ss.getInterfaces();
        for(Class e:es){
            System.out.println(e);
        }
    }
}
