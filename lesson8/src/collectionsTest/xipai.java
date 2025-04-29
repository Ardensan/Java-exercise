package collectionsTest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class xipai {
    public static void main(String[] args) {
        List<Integer> test=new ArrayList<>();
        for(int i=0;i<=17;i++){
            test.add(i);
        }
        Collections.shuffle(test);
        System.out.println(test);
    }
}
