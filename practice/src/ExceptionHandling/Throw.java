package ExceptionHandling;

public class Throw {
    void age(int age){
        if(age<18){
            throw new ArithmeticException("Sorry chu cant vote");
        }else{
            System.out.println("Welcome to vote");
        }}
    public static void main(String[] args) {
        Throw t= new Throw();
        t.age(19);
    }
}
