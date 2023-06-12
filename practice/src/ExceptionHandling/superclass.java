package ExceptionHandling;


import Arrays.Array;

public class superclass {
    //    final int a=100;
//    void change(int b){
//        a=b+30;
//        System.out.println(a);
//    }
    public static void main(String[] args) {
        try {
//            int arr[] = new int[3];
//            System.out.println(arr[6]);
//            System.out.println("rohitggg");
            try {
                int a = 8 / 0;

            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        System.out.println("rohit");
//        superclass s=new superclass();
//        s.change(30);
//        try{
//            int arr[]=null;
//            arr[2]=5;
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }catch(NullPointerException e){
//            System.out.println(e);
//        }

    }
}

