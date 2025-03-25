//这里自定义了异常，并且在后面应用了此异常
class BaseException extends RuntimeException {
    public BaseException() {super();
    }
    public BaseException(String message) {super(message);
    }
    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }
    public BaseException(Throwable cause) {super(cause);}
}
class MyException extends BaseException {
    public MyException() {super();}
    public MyException(String message) {super(message);}
}
public class testYichang {
    public static void main(String[] args){
        try{
            throw new MyException("there is wrong order!");
        }
        catch(BaseException e){
            System.out.println(e.getMessage());
        }
    }
}
