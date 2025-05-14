package writerTest;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class testOne {
    public static void main(String[] args) {
        try(Writer w=new FileWriter(".\\readme.txt", StandardCharsets.UTF_8)){
            w.write('X');
            w.write("hello".toCharArray());
            w.write("hi,siri");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
