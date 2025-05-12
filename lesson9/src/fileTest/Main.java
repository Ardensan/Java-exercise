package fileTest;
import java.io.File;
import java.nio.file.*;
public class Main {
    public static void main(String[] args) {
        Path p1= Paths.get(".","test");//paths方法好拼接
        System.out.println(p1);
        System.out.println(p1.toAbsolutePath());
        File f1=p1.toFile(); //转换为file对象
        System.out.println(f1);
        for(Path p:Paths.get("..").toAbsolutePath()){//这样输出
            System.out.println(p);
        }
        System.out.println(Paths.get("..").toAbsolutePath());
        Path p2=Paths.get("test");
        File f2=p2.toFile();
        File[] f2test=f2.listFiles();
        for(File f:f2test){
            System.out.println(f);
        }
    }
}
