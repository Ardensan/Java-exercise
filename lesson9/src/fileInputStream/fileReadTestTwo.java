package fileInputStream;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class fileReadTestTwo {
    public static void main(String[] args) {
        String s;
        byte[] data={72,101,108,108,111,33};
        try(InputStream input =new ByteArrayInputStream(data)){
            String a=readAsString(input);
            System.out.println(a);
        }catch (Exception e){
            System.out.println(e);}
        try(InputStream input = new FileInputStream(".\\output.txt")){
            s=readAsString(input);
            System.out.println(s);
        }catch (Exception e){System.out.println(e);}
    }
    public static String readAsString(InputStream input) throws IOException{
        int n;
        StringBuilder sb=new StringBuilder();
        while((n=input.read())!=-1){
            sb.append((char)n);
        }
        return sb.toString();
    }
}
