package ExceptionHandling.CustomException;
class InvalidId extends Exception{
    InvalidId(String s){
        super(s);
    }
}

public class invalidinput {
    void methodCheck(int i)throws InvalidId{
        if(i<=0 || i>=999){
            throw new InvalidId("Wrong id please input in range 1-998");
        }
    }
    public static void main(String[] args) {
invalidinput d= new invalidinput();
try{
    d.methodCheck(0);
}catch (InvalidId e){
    System.out.println(e);
//    System.out.println(e.getMessage());
}
    }
}
