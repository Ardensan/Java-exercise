package fileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class testOne {
    public static void main(String[] args) throws IOException {
        OutputStream output=new FileOutputStream(".\\readme.txt");
        output.write(72);
        output.write(101);
        output.write(108);
        output.write(108);
        output.write(111);
        output.close();
    }
}
