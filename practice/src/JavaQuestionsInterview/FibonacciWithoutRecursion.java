package JavaQuestionsInterview;
//Write a Java program to print a Fibonacci sequence using recursion.
//A Fibonacci sequence is one in which each number is the sum of the two previous numbers. In this example, the sequence begins with 0 and 1. The following example code shows how to use a for loop to print a Fibonacci sequence:
public class FibonacciWithoutRecursion {
    public static void main(String[] args) {
        System.out.println("without recursion ");
        fibonacci(10);
        System.out.println("with recursion ");
        for (int i=0;i<=10;i++){
            System.out.println(FibonacciWithRecursion.fibonacciWithRecursion(i));
        }
    }
    public static void fibonacci(int num){
        int a=0;
        int b=1;
        int c=1;

        for(int i=1; i<=num;i++){
            System.out.println(a);
            a=b;
            b=c;
            c=a+b;
        }
    }
}
class FibonacciWithRecursion extends FibonacciWithoutRecursion{
    public static int fibonacciWithRecursion(int num){
//        for (int i=1;i<=num;i++){
//
//        }
        if(num<=1){
            return num;
        }
        return fibonacciWithRecursion(num-1) +fibonacciWithRecursion(num-2);
    }
}
