class Factorial{
    public long fact(long n) {
        long r = 1;
        for (long i = 1; i <= n; i++) {
            r = r * i;
        }
        return r;
    }
}

public class Main {
    public static void main(String[] args) {
        Factorial d=new Factorial();

    }
}
