package ExceptionHandling;

import Arrays.Array;

public class NestedTryEg2 {
    public static void main(String[] args) {
        try{               //outer main
            try{               //inner main 1
                try{             //inner main2
                    int arr[]=new int[-2];   //negaive size of array will return parent exception
                    arr[5]=5;

                }catch (ArithmeticException e){
                    System.out.println(e);
                    System.out.println("inner main2");
                }
            }catch(NullPointerException e){
                System.out.println(e);
                System.out.println("inner main1");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("outer main 1");
        }catch (Exception e){
            System.out.println(e);
            System.out.println("parent exception");
        }
        System.out.println("rest of the code");
    }
}
