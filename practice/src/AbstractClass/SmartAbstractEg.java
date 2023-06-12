package AbstractClass;

abstract class Smartphone{
    abstract void calling();
}
class Android extends Smartphone{
    void calling(){
        System.out.println("someone is calling....");
    }
}
public class SmartAbstractEg {
    public static void main(String[] args) {
        Android a1=new Android();
        a1.calling();
    }
}
