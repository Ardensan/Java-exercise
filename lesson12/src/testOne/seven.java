package testOne;

import java.util.List;

public class seven {
    public static void main(String[] args) {
        String re="\\d{1,4}-\\d{7,8}";
        for(String s:List.of("010-12345678", "020-9999999", "0755-7654321")){
            if(!s.matches(re)){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
