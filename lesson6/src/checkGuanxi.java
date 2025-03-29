public class checkGuanxi {
    public static void main(String[] args) {
        Object n =Integer.valueOf(123);
        boolean isDouble = n instanceof Double;
        System.out.println(isDouble);
        boolean isInteger = n instanceof Integer;
        System.out.println(isInteger);
        boolean isNumber = n instanceof Number;
        System.out.println(isNumber);
        boolean isSerializable = n instanceof java.io.Serializable;
        System.out.println(isSerializable);
        System.out.println("分界线----");
        System.out.println(Integer.class.isAssignableFrom(Integer.class));
        System.out.println(Number.class.isAssignableFrom(Integer.class));
        System.out.println(Object.class.isAssignableFrom(Integer.class));
        System.out.println(Integer.class.isAssignableFrom(Number.class));
    }
}
