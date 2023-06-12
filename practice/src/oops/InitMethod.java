package oops;
class Employee1{
    int id;
    String name;
    double salary;
    void details(int i,String s,double sa){
        id=i;
        name=s;
        salary=sa;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}
public class InitMethod {
    public static void main(String[] args) {
        Employee1 e1= new Employee1();
        e1.details(101,"rahul",23000);
        e1.display();
    }
}

