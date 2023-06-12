package ExceptionHandling;

import java.awt.geom.Area;

public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int arr[]=new int[6];
            arr[10]=10/0;
            System.out.println(arr[10]);
        } catch(Exception e){ //order of exceptions wrong from most generic to specific
            System.out.println(e);
       }
    /* catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(ArithmeticException e){
            System.out.println(e);
        }*/
    }

}
