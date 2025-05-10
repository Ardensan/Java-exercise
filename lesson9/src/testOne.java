import java.io.File;
public class testOne {
    public static void main(String[] args) {
        File f1=new File("D:\\win");
        File f2=new File("D:\\galgame");
        File f3=new File("D:\\steam\\steam.exe");
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());
        System.out.println(f3.isFile());
        System.out.println(f3.isDirectory());
        System.out.println(f3.length()/1024 + "KB");
    }
}
