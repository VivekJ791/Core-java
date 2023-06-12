package oops;
class Student3{
    int rollno;
    String name;
    float fee;
//    Student3(int rollno,String name,float fee){
//        rollno=rollno;
//        name=name;
//        fee=fee;
//    }
    void display(int rollno,String name,float fee){
        rollno=rollno;
        name=name;
        fee=fee;
        System.out.println(rollno+" "+name+" "+fee);}
}
public class This {
    public static void main(String[] args) {
        Student3 s1=new Student3();
        Student3 s2=new Student3();
        s1.display(111,"ankit",5000f);
        s2.display(112,"sumit",6000f);
    }
}
