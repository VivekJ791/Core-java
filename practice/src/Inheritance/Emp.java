package Inheritance;

public class Emp {
    String name;
    int id;
    Address address;
    public Emp(String name,int id,Address address){
        this.name=name;
        this.id=id;
        this.address=address;
    }
    void display(){
        System.out.println("Name:"+name+" Id:"+id);
        System.out.println("City:"+address.city+" State:"+address.country+" Country:"+address.country);
    }
    public static void main(String[] args) {
        Address a=new Address("Mumbai","Maharashtra","India");
        Address b= new Address("Pune","Maharashtra","India");
        Emp e1=new Emp("rahul",21,a);
        Emp e2=new Emp("rohit",22,b);
        e1.display();
        e2.display();
    }
}
