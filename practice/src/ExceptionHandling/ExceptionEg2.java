package ExceptionHandling;

public class ExceptionEg2 {
    public static void main(String[] args) {
        int i=60;
        int j=0;
        int k;
        try{
            k= i/j;
        }catch (ArithmeticException e){
            System.out.println(i/(j+2));
        }

    }
}
