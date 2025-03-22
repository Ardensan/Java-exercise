import java.util.StringJoiner;
public class testThree {
    public static void main(String[] args) {
        String[] name={"adam","bill","candy","david"};
        StringJoiner sj = new StringJoiner(",", "hello ", "!");
        for(String n:name){
            sj.add(n);
        }
        //System.out.println(sj);
        String ss=String.join(", ",name);
        System.out.println(ss);
    }
}














/*      StringBuilder sb=new StringBuilder();
            sb.append("hello ");
                for(String n:name){
                sb.append(n).append(", ");
                }
                //制定删除的索引，指定字符串的开头和结尾。
                sb.delete(sb.length()-2,sb.length());
                System.out.println(sb.toString());*/