package fileTestOne;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class testThree {
    public static void main(String[] args) throws Exception {
        String con1= Files.readString(Path.of("test","one","test.txt"));
        System.out.println(con1);
        List<String> lines=Files.readAllLines(Path.of("test","one","test.txt"));
        System.out.println(lines.size());
        System.out.println(lines);
    }
}
