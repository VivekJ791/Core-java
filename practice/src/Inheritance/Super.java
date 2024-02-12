package Inheritance;
class Human2{
    String name= new String();
    void talk(){
        System.out.println("i am  a human ");
    }
    Human2(String talk){
        this.name= talk;
    }
}
class Employee2 extends Human2{
    String name=new String();
    Employee2(String name){
        super("human");
        this.name= name;
    }
    void talk(){
        super.talk();
        System.out.println("i am a employee");
    }
}
public class Super {
    public static void main(String[] args) {
        Employee2 e1= new Employee2("employee");
        e1.talk();
        System.out.println("changes");
    }
}
