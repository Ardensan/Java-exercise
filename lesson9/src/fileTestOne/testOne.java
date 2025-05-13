package fileTestOne;
import java.nio.file.Files;
import java.nio.file.Path;

public class testOne {
    public static void main(String[] args) {
        try{
            byte[] data= Files.readAllBytes(Path.of(".\\output1.txt"));
            for(int i=0;i<data.length;i++){
                System.out.println(data[i]);
            }
        }catch (Exception e){
        }
    }
}
