package ExceptionHandling.CustomException;
class MyException1 extends Exception{
    String str;
    public MyException1(String str){
        super(str);
        this.str=str;
    }
    public String toString(){
        return str;
    }
}
public class CustomExceptionEg2 {
    public static void main(String[] args) {
        try{
            throw new MyException1("this is a string ");
        }catch( MyException1 e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }

    }
}
