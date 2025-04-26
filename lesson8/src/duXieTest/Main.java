package duXieTest;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class Main {
    public static void main(String[] args) {
        Properties props=new Properties();
        try(FileInputStream fis=new FileInputStream("src/duXieTest/test.properties")){
            props.load(fis);
        }catch (IOException e){
            e.printStackTrace();
        }
        String url=props.getProperty("url");
        String lang=props.getProperty("language");
        System.out.println(url + lang);
        props.setProperty("key","中文值");
        try{
            props.storeToXML(new FileOutputStream("src/duXieTest/test.properties"),
                    "写入ABC注释","UTF-8");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
