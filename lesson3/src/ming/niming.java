package jun;
interface Greeting{
    void greet(String name);
}
public class niming {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
          @Override
            public void greet(String name){
              System.out.println("hello"+name
              );
          }
        };
        g.greet("六");
    }
}
