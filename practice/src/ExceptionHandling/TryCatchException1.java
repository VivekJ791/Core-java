package ExceptionHandling;

public class TryCatchException1 {
    public static void main(String[] args) {
        try{
            String s=null;
            System.out.println(s.substring(1,3));
            System.out.println("rest of code");//not executed cuz inside try block
        }catch(NullPointerException e) {
//            System.out.println(e);
            System.out.println("String cant be null like cmon");// custom message
        }
    }
}
