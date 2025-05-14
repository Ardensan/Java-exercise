package writerTest;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class testTwo {
    public static void main(String[] args) {
        try(CharArrayWriter w=new CharArrayWriter()){
            w.write(65);
            w.write(66);
            w.write(67);
            w.write(68);
            char[] data=w.toCharArray();
            Writer wr=new FileWriter(".\\output1.txt", StandardCharsets.UTF_8);
            wr.write(data);
            wr.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
