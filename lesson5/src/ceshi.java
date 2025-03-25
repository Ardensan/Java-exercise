public class ceshi {
    static void process1(){
        process2();
    }
    static void process2(){
        Integer.parseInt(null);
    }
    public static void main(String[] args) {
        try{
            process1();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
