package ExceptionHandling.CustomException;
class CustomException extends Exception{
    CustomException(String str){
        super(str);
    }
}
public class UserDefinedException {
    String user;
    String id;
    void Check(String u,String i) throws CustomException{
        if(u!="admin" && i!="admin"){
            throw new CustomException("wrong credentials");
        }
    }
    public static void main(String[] args) {
        UserDefinedException ude= new UserDefinedException();
        try{
            ude.Check("adjfsl","akld");
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
}
