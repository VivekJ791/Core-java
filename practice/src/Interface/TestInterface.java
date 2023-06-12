package Interface;
interface Company{
    public void getName();
}
interface Google extends Company{
    public void setName();
}
class daynil implements Google,Company{
    public void getName(){
        System.out.println("company");
    }
    public void setName(){
        System.out.println("got name");
    }
}

    public class TestInterface {
        public static void main(String[] args) {
            daynil g= new daynil();
            g.getName();
        }
    }

