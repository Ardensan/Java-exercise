import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;
public class rizhiTest {
    public static void main(String[] args) {
        //获取Logger 对象,Main.class.getName()是当前的类名
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("start process..");
        try{
            "".getBytes("ee");
        }catch (UnsupportedEncodingException e){
            logger.severe(e.toString());
        }
        logger.info("process end");
    }
}
