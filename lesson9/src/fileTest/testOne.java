package fileTest;

import java.io.File;
import java.nio.file.*;

public class testOne {
    public static void main(String[] args) {
        Path p1=Paths.get("Documents");
        File f1=p1.toFile();
        File[] fs1=f1.listFiles();
        printff(fs1);
    }
    static void printff(File[] files){
        for(File f:files){
            if(f.isDirectory()){
                File[] fs=f.listFiles();
                System.out.println(f);
                printff(fs);
            }
            if(f.isFile()){
                System.out.println(f);
            }
        }
    }
}
