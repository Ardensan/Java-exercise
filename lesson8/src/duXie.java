import java.io.*;
import java.util.Properties;
public class duXie {
    public static void main(String[] args) throws Exception {
        String settings="#test"+"\n"+"course=java"+"\n"+"last_open_date=20250423";
        ByteArrayInputStream input=new ByteArrayInputStream(settings.getBytes("UTF-8"));
        Properties props=new Properties();
        props.load(input);
        //这是个字典，key-value
        System.out.println(props.get("course"));
        System.out.println(props.get("last_open_date"));
        System.out.println(props.get("last_open_file"));
        System.out.println("auto_save: " + props.getProperty("auto_save", "60"));
    }
}
