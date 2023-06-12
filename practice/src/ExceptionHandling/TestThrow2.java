package ExceptionHandling;

import java.io.IOException;
//throws but no exception occured
class A{
    static void method() throws IOException {
        System.out.println("no actual exception occured ");
    }
}
public class TestThrow2 {
    public static void main(String[] args) {
        A a= new A();
        try{
            A.method();
        }catch (IOException e){
            System.out.println(e);
        }
        System.out.println("normal flow");
    }
}
