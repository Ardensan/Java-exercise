public class BankAccount {
    private double balance;
    public BankAccount(double balance){this.balance=balance;}
    //处理余额不足的时候的异常
    public class yuerbuzu extends Exception{
        public yuerbuzu(String meessage){super(meessage);}
    }
    //取款方法，可能抛出异常
    public void withdraw(double amout) throws yuerbuzu{
        //检查取多少钱。这里调用了java原生的异常类的方法
        if(amout<=0){throw new IllegalArgumentException("取款金额输入必须大于0");}
        if(amout>balance){throw new yuerbuzu("没这么多钱给你取");}
        //执行取款
        balance = balance - amout;
        System.out.println("成功取款,还剩下:"+balance);
    }
    public static void main(String[] args) {
        BankAccount account=new BankAccount(2000);
        try{
            account.withdraw(1500);
            account.withdraw(1000);
            account.withdraw(-5);
        }catch (yuerbuzu e) {
            System.out.println("错误"+e.getMessage());
        }catch (IllegalArgumentException e) {
            System.out.println("非法参数错误"+e.getMessage());
        }
    }
}
