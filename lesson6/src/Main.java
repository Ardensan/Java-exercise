public class Main {
    static void printClassInfo(Class cls){
        System.out.println("Class name: " + cls.getName());
        System.out.println("Simple name: " + cls.getSimpleName());
        System.out.println("Package name: " + cls.getPackage());
        System.out.println("is interface "+ cls.isInterface());
    }
    public static void main(String[] args) {
        printClassInfo("".getClass());
        printClassInfo(Runnable.class);
        printClassInfo(java.time.Month.class);
    }
}