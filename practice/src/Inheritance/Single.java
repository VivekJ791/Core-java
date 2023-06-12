package Inheritance;

class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void action(){
        System.out.println("barking...");
    }
}
class Cat extends Animal{ //this is heirachical okay
    void action(){
        System.out.println("meowiing ..");
    }
}

public class Single {
    public static void main(String[] args) {
        Dog d=new Dog();
        Cat c=new Cat();
        d.eat();
        d.action();
        c.eat();
        c.action();
    }
}
