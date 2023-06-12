package ExceptionHandling;

public class NestedTry {
    public static void main(String[] args) {
        try{
            try{
                int a= 6/0;
            }catch (ArithmeticException e){
                System.out.println(e);
            }
            try{
                int arr[]=new int[5];
                arr[5]=6;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
//            String s=null;
//            System.out.println(s.length());
        }catch (Exception e){   //parent exception but parent try mei kuch hai hi nhi ,agar upar ke 2 line
//            comment off kardiya toh execute hoga nullpointerexception
            System.out.println(e);
        }
        System.out.println("end");
    }
}
