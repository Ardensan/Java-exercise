public class tryFinal {
    class Person{
        protected String name;
        public final String run(){
            return "run"+name;
        }
    }
    class Student extends Person{
        @Override
        public String run() {
            return "run";
        }
    }
    final class Genshin{
        public Genshin(){
            System.out.println("genshin");
        }
    }
    class mihoyo extends Genshin{

    }
    public static void main(String[] args) {
        final String name="qwe";
        name="sds";
    }
}
