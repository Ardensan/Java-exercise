package fileInputStream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class fileReadTestOne {
    public static void main(String[] args) {
        String s;
        try(InputStream input=new FileInputStream(".\\output.txt")){
            int n;
            StringBuilder sb=new StringBuilder();
            while((n=input.read())!=-1){
                sb.append((char)n);
            }
            System.out.println(sb);
            s=sb.toString();
            System.out.println(s);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
