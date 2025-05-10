import java.io.PrintWriter;
import java.io.StringWriter;

public class testTwo {
    public static void main(String[] args) {
        StringWriter buffer=new StringWriter();
        try(PrintWriter pw=new PrintWriter(buffer)){
            pw.println("hello");
            pw.println(233);
            pw.println(true);
            System.out.println(buffer);
            System.out.println(pw);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
