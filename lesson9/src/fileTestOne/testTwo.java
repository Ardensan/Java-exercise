package fileTestOne;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class testTwo {
    public static void main(String[] args) {
        try{
            String con1= Files.readString(Path.of(".\\output.txt"));
            System.out.println(con1);
            List<String> lines=Files.readAllLines(Path.of(".\\output.txt"));
            System.out.println(lines);
        }catch (Exception e){
        }
    }
}
