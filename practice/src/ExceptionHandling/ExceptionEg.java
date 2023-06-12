package ExceptionHandling;

public class ExceptionEg {
    public static void main(String[] args) {
        try{
//            int a= 100/0;
//            String s="abc";
////            System.out.println(s.length());
//            int i= Integer.parseInt(s);
            int arr[]= new int[6];
            arr[6]=10;
        }
        catch(NullPointerException f){
            System.out.println(f
            );

        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch (NumberFormatException n){
            System.out.println(n);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        for(int i=0;i<=4;i++){
            System.out.println(i);
        }
    }
}
