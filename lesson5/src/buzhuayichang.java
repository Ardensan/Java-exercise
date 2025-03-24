import java.io.UnsupportedEncodingException;
import java.util.Arrays;
public class buzhuayichang {
    static byte[] toGBK(String s){
        try{
            return s.getBytes("GBK");
        }catch (UnsupportedEncodingException e){
            System.out.println(e);
            return s.getBytes();
        }
    }
    public static void main(String[] args) {
        byte[] bs= toGBK("中文语言");
        System.out.println(Arrays.toString(bs));
    }
}
