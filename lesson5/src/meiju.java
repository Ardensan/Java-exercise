public class meiju {
    enum weekDay{
        SUN(0,"周日"),
        MON(1,"周y"),
        TUE(2,"周e"),
        WED(3,"周s"),
        THU(4,"周si"),
        FRI(5,"周wu"),
        SAT(6,"周liu");
        public final int dayVaule;
        private final String chinese;
        private weekDay(int dayVaule, String chinese) {
            this.dayVaule=dayVaule;
            this.chinese=chinese;
        }
    }
    public static void main(String[] args) {
        //返回常量名字
        String s=weekDay.MON.name();
        System.out.println(s);
        //返回常量的索引值，从0开始
        int n =weekDay.THU.ordinal();
        System.out.println(n);
        String ss=weekDay.FRI.chinese;
        System.out.println(ss);
        int i=weekDay.TUE.dayVaule;
        System.out.println(i);
    }
}
