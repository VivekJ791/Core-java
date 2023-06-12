package oops;

class formClass{
    void form(){
        System.out.println("hello 1st method");
    }
    void form2(){
        this.form();
        System.out.println("hello 2nd method");
    }
}
public class ThisMethod {

    public static void main(String[] args) {
formClass f1=new formClass();
f1.form2();
    }
}
