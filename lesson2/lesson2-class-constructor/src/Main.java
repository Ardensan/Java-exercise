// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。


public class Main {
    private static class Person{
        private String name;
        private int age;
        public Person(String name,int age){
            this.name=name;
            this.age=age;
        }
        public String getName(){
            return this.name;
        }
        public int getAge(){
            return this.age;
        }
    }

    public static void main(String[] args) {
        Person a=new Person("yui",13);
        System.out.println(a.getName()+a.getAge());
    }
}

