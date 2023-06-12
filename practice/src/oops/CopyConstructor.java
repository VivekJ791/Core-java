package oops;
class Student1{
    String name;
    int id;
    int age;
    Student1(String n,int i,int a){
        name=n;
        id=i;
        age=a;
    }
    Student1(Student1 r){ //here we are passing an object as argument s1 is object
        // if we dont do this than we cant copy
        name=r.name;
        id=r.id;
        age=r.age;
    }
void display(){
    System.out.println(name+" "+ id+" "+age);
}
}
public class CopyConstructor {
    public static void main(String[] args) {
        Student1 s1=new Student1("rahul",21,18);
        Student1 s2=new Student1(s1);
        s1.display();
        s2.display();
    }
}
