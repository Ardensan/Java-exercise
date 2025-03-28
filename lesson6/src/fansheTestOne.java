class person{
    public String getName(){return "haha";}
}

class student extends person{
    public int getScore(String type){return 22;}
    private int getGrade(int year){return 1;}
}
public class fansheTestOne {
    public static void main(String[] args) throws Exception{
        Class std=student.class;
        System.out.println(std.getMethod("getScore", String.class));
        System.out.println(std.getMethod("getName"));
        System.out.println(std.getDeclaredMethod("getGrade", int.class));
    }
}
