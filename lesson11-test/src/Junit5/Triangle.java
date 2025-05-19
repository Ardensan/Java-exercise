package Junit5;

public class Triangle {
    public static int getType(int a,int b,int c){
        if(a+b>c && a+c>b && b+c>a){
            if(a==b && b==c){
                return 3;
            }
            else if(a!=b && a!=c && b!=c){
                return 1;
            }
            else{
                return 2;
            }
        }else {
            return 0;
        }
    }
}
