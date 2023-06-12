package DownCasting;
class Animal2{

}
class Dog2 extends Animal2{
     void method(Animal2 a){
        Dog2 d=(Dog2)a;
        System.out.println("downcasting done");
    }
}
public class downcastWithoutinstanceOf {
    public static void main(String[] args) {
        Animal2 a= new Dog2();
        Dog2 d= new Dog2();
        d.method(a);
    }
}
