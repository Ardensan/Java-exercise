public class fanshe {
    class Person{
        public String name;
    }
    class Student extends Person{
        public int score;
        private int grade;
    }
    public static void main(String[] args) {
        Class std=Student.class;
        System.out.println(std.getName());
        try{
            System.out.println(std.getField("score"));
            System.out.println(std.getField("name"));
            System.out.println(std.getDeclaredField("grade"));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
