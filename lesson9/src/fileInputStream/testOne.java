package fileInputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class testOne {
    public static void main(String[] args) {
        try{
            InputStream input=new FileInputStream(".\\output.txt");
            for(;;){
                int n=input.read();
                if(n== -1){
                    break;
                }
                System.out.println(n);
            }
            input.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
