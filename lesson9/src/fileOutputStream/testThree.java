package fileOutputStream;
import java.io.ByteArrayOutputStream;
public class testThree {
    public static void main(String[] args) {
        byte[] data;
        try(ByteArrayOutputStream output = new ByteArrayOutputStream()){
            output.write("hello world".getBytes("UTF-8"));
            output.write("你好世界".getBytes("UTF-8"));
            data=output.toByteArray();
            System.out.println(new String(data,"UTF-8"));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
