package fileOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class testTwo {
    public static void main(String[] args) throws IOException {
        OutputStream output=new FileOutputStream(".\\readme.txt");
        output.write("你好,世界".getBytes("UTF-8"));
        output.close();
    }
}
