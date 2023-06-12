package recursion;

public class fibonacci {
    static int fibonaccis(int n){
        if(n==1 || n==2){
            return 1;}
        return fibonaccis(n-1) + fibonaccis(n-2);
    }
    public static void main(String[] args) {
        int num=10;
        for(int i=1;i<=num;i++){
            System.out.println(fibonaccis(i)+" ");
        }
//        static int fibonacci(int n) {
//            if (n <= 1) {
//                return n;
//            }
//            return fibonacci(n-1) + fibonacci(n-2);
//        }
//        public static void main(String[] args) {
//            int number = 10;
//
//            //print first 10 numbers of fibonacci series
//            System.out.println ("Fibonacci Series: First 10 numbers:");
//            for (int i = 1; i <= number; i++)
//            {
//                System.out.print(fibonaccis(i) + " ");
//            }
    }
}
