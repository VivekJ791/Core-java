package ExceptionHandling;

import java.io.IOException;

public class TestThrowPropagation {
    void m()throws IOException{
        throw new IOException("exception handled");
    }
    void n() throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        TestThrowPropagation obj=new TestThrowPropagation();
        obj.p();
        System.out.println("normal flow");
    }
}
