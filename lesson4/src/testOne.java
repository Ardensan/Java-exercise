import java.util.Arrays;

public class testOne {
    class Score{
        private int[] scores;
        public Score(int[] scores){
            //this.scores=scores;
            this.scores=Arrays.copyOf(scores,scores.length);
        }
        public String printScores(){
            return Arrays.toString(this.scores);
        }
    }

    class Teacher{
        private int age;
        public Teacher(int age){
            this.age=age;
        }
        public int getAge() {
            return this.age;
        }
    }
    public static void main(String[] args) {
        int age1=24;
        Teacher t=new testOne().new Teacher(age1);
        System.out.println(t.getAge());
        age1=16;
        System.out.println(t.getAge());
        int[] s={88,77,66,44};
        Score ss=new testOne().new Score(s);
        System.out.println(ss.printScores());
        s[2]=12;
        System.out.println(ss.printScores());
    }
}
