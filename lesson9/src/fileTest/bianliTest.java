package fileTest;

import java.io.File;
import java.io.FilenameFilter;

public class bianliTest {
    static void printFiles(File[] files){
        System.out.println("====");
        if(files!=null){
            for(File f:files){
                System.out.println(f);
            }
        }
        System.out.println("====");
    }
    public static void main(String[] args) {
        File f=new File("D:\\qudong");
        File[] fs1=f.listFiles();
        // listFiles()列出所有文件和子目录
        //printFiles(fs1);
        File[] fs2=f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".exe");
            }
        });
        printFiles(fs2);
    }
}
