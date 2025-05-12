package fileTest;
import java.io.File;
public class createTest {
    public static void main(String[] args) {
        File file=new File("D:\\test.txt");
        try{
            if(file.isFile()){
                System.out.println("have");
            }
            if(file.delete()){
                System.out.println("true");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
