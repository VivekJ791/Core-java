package ExceptionHandling;


class UdException extends Exception{
    String str;
    public UdException(String str){
        super(str);

    }

    static void method(String str) throws UdException{
        throw new UdException("brah");
    }}
public class TestThrow {
    public static void main(String[] args) {
//        UdException n=new UdException();
        try{
            UdException.method("ss");
        }catch(UdException e){
            System.out.println(e);
        }
    }
}
