package test1;
public class duanyan {
    public static void main(String[] args) {
        double x=Math.abs(-123.32);
        x=-2;
        //使用assert语句时，还可以添加一个可选的断言消息
        assert x>=0 : "x must >=0";
        System.out.println(x);
    }
}
