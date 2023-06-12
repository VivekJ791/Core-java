package oops;

class Employee{
    int id;
    String name;
}
public class InitRef {
    public static void main(String[] args) {
        Employee e1= new Employee();
        e1.id= 459;
        e1.name= "rahul";
        System.out.println(e1.id+" "+e1.name);
    }
}
