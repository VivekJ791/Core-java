package DownCasting;
class Animal{

}
class dog extends Animal{
    static void method(Animal a){
        if(a instanceof Animal){
            dog d=(dog)a;
            System.out.println("downcasting done");
        }
    }
}
public class Downcast {
    public static void main(String[] args) {
        Animal a= new dog();
        dog.method(a);
    }
}
