
public class Main2 {
    public static void main(String args[]) {
        String name=getName();
        System.out.println(name);
    }

    static String getName(){
        String name="shashi";
        try{
            throw new RuntimeException("exception occurs");
        }catch(Exception e){
            System.out.println("in catch block");
            return "catch";
        }finally{
            System.out.println("finally");
        }
//        return "finally";
    }
}