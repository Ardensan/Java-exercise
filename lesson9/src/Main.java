import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath="D:\\test\\output.txt";
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(filePath))){
            writer.write("HI你好");
            System.out.println("success");
        }catch (IOException e){
            System.out.println(e);
        }
    }
}