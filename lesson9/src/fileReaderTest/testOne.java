package fileReaderTest;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
public class testOne {
    public static void main(String[] args) throws IOException {
        int n;
        Reader reader=new FileReader(".\\output.txt");
        StringBuilder sb=new StringBuilder();
        while ((n=reader.read())!=-1){
            sb.append((char)n);
        }
        reader.close();
        System.out.println(sb);
    }
}
