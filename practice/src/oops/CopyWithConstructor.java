package oops;

public class CopyWithConstructor {
    int id;
    String name;
    CopyWithConstructor(int i,String n){
        id=i;
        name=n;
    }
    CopyWithConstructor(){
    }
    void display(){
        System.out.println(id+" "+ name);
    }
    public static void main(String[] args) {
        CopyWithConstructor c1=new CopyWithConstructor(12,"rahul");
        CopyWithConstructor c2= new CopyWithConstructor();
        c2.id=c1.id;
        c2.name=c1.name;
        c1.display();
        c2.display();
    }
}
