public class lianshicaozuo {
    class Adder{
        private int sum=0;
        public Adder add(int n){
            sum+=n;
            return this;
        }
        public int getSum(){
            return this.sum;
        }
    }
    public static void main(String[] args) {
        Adder a=new lianshicaozuo().new Adder();
        a.add(10).add(7).add(55);
        System.out.println(a.getSum());
    }
}
