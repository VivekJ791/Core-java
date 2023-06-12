package ExceptionHandling;

public class ExceptionEg3 {
    public static void main(String[] args) {
//        try{
////            int a=10/0;
//            int arr[]=new int[10];
//            System.out.println(arr[10]);
//        }catch (Exception e){ // exception daala hai specify nhi kiya hai
////            int b=7/10;
//            int arr[]=new int[4];
//            System.out.println(arr[8]);
//        }
//        try
//        {
//            int data1=50/0; //may throw exception
//
//        }
//        // handling the exception
//        catch(Exception e)// bus Exception daala hai fully specify nhi kiya hai
//        {
//            // generating the exception in catch block
//            int data2=50/0; //may throw exception
//
//        }
        // Try to handle ArithmeticException with ArrayIndexOutOfBounds exception

        try{
            int x=9/0;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
