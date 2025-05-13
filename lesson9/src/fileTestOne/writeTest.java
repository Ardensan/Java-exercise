package fileTestOne;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class writeTest {
    public static void main(String[] args) throws IOException {
        byte[] data={65,66,67,77,78,79};
        Files.write(Path.of("output2.txt"),data);
        String text="尝试下写入文本";
        Files.writeString(Path.of("output3.txt"),text, StandardCharsets.UTF_8);
        List<String> lines=new ArrayList<>();
        lines.add("第一行内容");
        lines.add("第二行内容");
        lines.add("第三行是什么呢?");
        Files.write(Path.of("output4.txt"),lines);
    }
}
