package xuLieHua;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class testOne {
    public static void main(String[] args) {
        ByteArrayOutputStream buffer=new ByteArrayOutputStream();
        try(ObjectOutputStream out=new ObjectOutputStream(buffer)){
            out.writeInt(1234);
            out.writeUTF("hello");
            out.writeObject(Double.valueOf(12.23));
            System.out.println(Arrays.toString(buffer.toByteArray()));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
