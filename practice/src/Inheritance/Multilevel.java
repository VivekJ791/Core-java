package Inheritance;
class Human{
    void human(){
        System.out.println("Im a Human first ");
    }
}
class Employee1 extends Human{
    void work(){
        System.out.println("Im a Employee second ");
    }

}
class Programmer1 extends Employee1{
    void action(){
        System.out.println("Im a Programmer third");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Programmer1 p=new Programmer1();
        p.action();
        p.human();
        p.work();
    }
}
