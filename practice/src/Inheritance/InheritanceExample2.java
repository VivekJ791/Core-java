package Inheritance;

public class InheritanceExample2 {
    public static void main(String[] args) {
        Tree t= new Chair();
        t.talk();    }
}
class Tree{
    void talk(){
        System.out.println("IM a tree");
    }
}
class Wood extends Tree{
    void talk(){
        System.out.println("IM a Wood made from tree");
    }
}
class Chair extends Wood{
    void talk(){
        System.out.println("IM a chair made from wood from a tree");
    }
}