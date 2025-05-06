package fileInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
public class autoClose {
    public static void main(String[] args) {
        try(InputStream input = new FileInputStream(".\\output.txt")){
            int n;
            while ((n=input.read())!=-1){
                System.out.println(n);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
