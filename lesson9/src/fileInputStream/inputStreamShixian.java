package fileInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
public class inputStreamShixian {
    public static void main(String[] args) {
        byte[] data={72,101,108,126,111,33};
        try(InputStream input = new ByteArrayInputStream(data)){
            int n;
            while((n=input.read())!= -1){
                System.out.println(n);
                System.out.println((char)n);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
