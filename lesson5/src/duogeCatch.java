import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class duogeCatch {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try{
            reader =new BufferedReader(new FileReader("test.txt"));
            String line=reader.readLine();
            System.out.println("文本的第一行是"+line);
        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("执行完成");
        }
    }
}
