package ExceptionHandling.CustomException;
class MyException extends Exception{
    MyException(String  s){
        super(s);
    }
}
public class CustomExceptionEg1 {

    public static void main(String[] args) {
        try{
            throw new MyException("hello this is user defined custom exception");
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
