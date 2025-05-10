import java.io.File;
public class guiFanPath {
    public static void main(String[] args) {
        File f=new File("test");
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(File.separator);
        try{
            System.out.println(f.getCanonicalPath());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
