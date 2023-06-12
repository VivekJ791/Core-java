package ExceptionHandling;


public class TestThrow1 {
    class B{
        static void method()throws ArithmeticException{
            throw new ArithmeticException();
        }
    }
    public static void main(String[] args) throws ArithmeticException {
//        B b= new B();
        try{
            B.method();
        }catch(ArithmeticException e){
            System.out.println(e);
        }

        System.out.println("exception occured");
    }
}
