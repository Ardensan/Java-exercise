public class tryAnother {
    class geshihua{
        String s="hi i'm %s,i am %d year olds";
        public String getA(){return this.s;}
        public String getAc(){return this.s.formatted("jack",18);}
        public String getT(){return String.valueOf(true);}
        public String getF(){return String.valueOf(45.55);}
        public String getM(){return String.valueOf(new tryAnother());}
        public int getI(){return Integer.parseInt("fd",16);}
        public boolean getTure(){return Boolean.parseBoolean("true");}
        public boolean getFalse(){return Boolean.parseBoolean("ture");}
    }
    public static void main(String[] args) {
        geshihua a= new tryAnother().new geshihua();
        System.out.println(a.getTure());
        System.out.println(a.getFalse());
        System.out.println(a.getA());
        System.out.println(a.getAc());
        System.out.println(a.getT());
        System.out.println(a.getF());
        System.out.println(a.getM());
        System.out.println(a.getI());
    }
}
