package fileReaderTest;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

//设置缓冲区
public class testTwo {
    public static void main(String[] args) throws IOException {
        try(Reader reader=new FileReader(".\\output.txt",StandardCharsets.UTF_8)){
            char[] buffer=new char[1000];
            int n;
            while ((n=reader.read(buffer))!=-1){
                System.out.println(n);
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<buffer.length;i++){
                if(buffer[i]=='\u0000'){
                    break;
                }
                sb.append(buffer[i]);
            }
            System.out.println(sb);
        }
    }
}
