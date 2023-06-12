package ExceptionHandling;

public class FinallyEg {
    public static void main(String[] args) {
        try{
            int a=8/0;
            System.out.println(a);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("this is array index out of bounds exception");
        }
        finally{
            System.out.println("this block will always be executed lol");
        }
        System.out.println("rest of the code" );
    }

}