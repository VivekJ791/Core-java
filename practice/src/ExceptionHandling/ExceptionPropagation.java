package ExceptionHandling;

public class ExceptionPropagation {
    void m(){
        int a= 3/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        ExceptionPropagation p= new ExceptionPropagation();
        p.p();
    }
}
