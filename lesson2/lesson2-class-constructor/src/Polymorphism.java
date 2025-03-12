public class Polymorphism {
    class Income{
        double income;
        public Income(double income){
            this.income=income;
        }
        public double getTax(){
            return income * 0.1;
        }
    }
    class highIncome extends Income{
        public highIncome(double income){
            super(income);
        }
        @Override
        public double getTax(){
            if(income<=5000){
                return 0;
            }
            return (income-5000)*0.2;
        }
    }
    class specialIncome extends Income {
        public specialIncome(double income){
            super(income);
        }
        @Override
        public double getTax() {
            return 0;
        }
    }
    public static double totalTax(Income... incomes){
        double total = 0;
        for(Income income: incomes){
            total = total + income.getTax();
        }
        return total;
    }
    public static void main(String[] args){
        Polymorphism a = new Polymorphism();
        Income[] incomes = new Income[]{
                a.new Income(3000),
                a.new highIncome(8000),
                a.new specialIncome(1000),
        };
        System.out.println(totalTax(incomes));
    }
}
