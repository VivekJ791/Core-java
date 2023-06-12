package oops;

public class StaticVariable {
    int id;
    String name;
    static String school="rkt";
    StaticVariable(int i,String n){
        id=i;
        name=n;
        System.out.println(id + " " +n+" "+school);
    }

    public static void main(String[] args) {
        StaticVariable s=new StaticVariable(10,"vivek");
        StaticVariable s2=new StaticVariable(2,"maithili");

    }
}
