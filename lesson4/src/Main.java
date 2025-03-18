public class Main {
    public static void main(String[] args) {
        String s1= "hello";
        String s2="hello";
        //System.out.println(s1.equals(s2));
        String s3="Hello";
        //System.out.println(s1.equals(s2));
        //System.out.println(s1.equalsIgnoreCase(s2));
        //contains此字符是否包含此字符串
        System.out.println(s2.contains("ll"));
        //indexOf是表示此字符在索引从0开始，到索引的第几位为出现
        System.out.println(s2.indexOf("l"));
        //lastIndexOf是表示索引从后往前数，第几位出现
        System.out.println(s2.lastIndexOf("l"));
        //startsWith是表示此字符在开头有出现吗？
        System.out.println(s2.startsWith("e"));
        System.out.println(s2.startsWith("he"));
        //endsWith是表示此字符在最后面有出现过吗？
        System.out.println(s2.endsWith("lo"));
        System.out.println(s2.endsWith("e"));
        //substring是提取字符串，输入索引值，没输就是从0开始
        System.out.println(s2.substring(2));
        System.out.println(s2.substring(1,4));

    }
}