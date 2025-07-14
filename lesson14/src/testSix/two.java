package testSix;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class two {
    static String tureResult(String n){
        Pattern number=Pattern.compile("[0-9]");
        Matcher m1=number.matcher(n);
        Pattern zimu=Pattern.compile("[a-zA-Z]");
        Matcher m2=zimu.matcher(n);
        Pattern teshuzifu=Pattern.compile("[^a-zA-Z0-9]");
        Matcher m3=teshuzifu.matcher(n);
        int pwHardCount=0;
        while (m1.find()){
            pwHardCount=pwHardCount+1;
            break;
        }
        while (m2.find()){
            pwHardCount=pwHardCount+1;
            break;
        }
        while (m3.find()){
            pwHardCount=pwHardCount+1;
            break;
        }
        if(pwHardCount==1){
            return "简单密码";
        }else if(pwHardCount==2){
            return "中等密码";
        }else{
            return "强密码";
        }
    }
    public static void main(String[] args) {
        String a="123456";
        String b="123456abcAD";
        String c="123456abcAC#@";

        String d=tureResult(a);
        System.out.println(d);
        String dd=tureResult(b);
        System.out.println(dd);
        String ddd=tureResult(c);
        System.out.println(ddd);
    }
}
