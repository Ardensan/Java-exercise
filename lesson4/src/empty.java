public class empty {
    class pinjie{
        String[] arr={"A","B","C"};
        String s=String.join("-",arr);
        public String getS(){
            return this.s;
        }
    }
    public static void main(String[] args) {
        empty a=new empty();
        pinjie as=a.new pinjie();
        System.out.println(as.getS());
        String s="\t name \n";
        System.out.println(s.trim());
        s=s.trim();
        System.out.println(s.replace('n','w'));
        s="a,b,c,d";
        String[] ss=s.split(",");
        for (String s1 : ss) {
            System.out.println(s1);
        }
    }
}
