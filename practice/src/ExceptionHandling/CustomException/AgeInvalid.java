package ExceptionHandling.CustomException;

class CheckAgeException extends Exception{
    public CheckAgeException(String str){
        super(str);
    }
}
public class AgeInvalid {
    void method(int n) throws CheckAgeException{
        if(n<18){
            throw new CheckAgeException("Sorry cant vote age is less than required limit");
        }
        else{
            System.out.println("you can vote");
        }
    }
    public static void main(String[] args) {
AgeInvalid a= new AgeInvalid();
try{
    a.method(19);
}catch(CheckAgeException e){
    e.printStackTrace();
}
    }
}
