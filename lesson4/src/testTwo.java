public class testTwo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(30);
        //链式操作
        sb.append("hello")
                .append("world")
                .append("java")
                .insert(0,"ero!");
        System.out.println(sb.toString());

        /*        for(int i=1;i<11;i++){
            sb.append(i);
            sb.append(',');
        System.out.println(sb.toString());
        }*/
    }
}
