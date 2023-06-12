package oops;
class Company{
    int noOfEmployees;
    String name;
    int branches;
    Company(int e,String n,int b){
        noOfEmployees=e;
        name=n;
        branches=b;
    }
    Company(int e,String n){
        noOfEmployees=e;
        name=n;
    }
    void display(){
        System.out.println(noOfEmployees+" "+name+" "+branches);
    }
}

public class ConstructerOverloading {
    public static void main(String[] args) {
        Company c1=new Company(66,"Google",2);
        Company c2= new Company(45,"infosys");
        c1.display();
        c2.display();
    }
}
