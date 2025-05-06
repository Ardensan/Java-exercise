package fileInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
public class huanChong {
    public static void main(String[] args) {
        try(InputStream input=new FileInputStream(".\\output.txt")){
            byte[] buffer=new byte[1000];
            int n;
            while((n=input.read(buffer,15,22))!=-1){
                System.out.println("有"+n+"bytes");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
