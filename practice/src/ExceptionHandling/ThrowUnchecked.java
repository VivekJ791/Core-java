package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowUnchecked {
    void method() throws FileNotFoundException{
        FileReader n=new FileReader("path/path/file.txt");
////        BufferedReader read= new BufferedReader(n);

        throw new FileNotFoundException();
    }
    public static void main(String[] args) {

        ThrowUnchecked t1=new ThrowUnchecked();
//        t1.method();
        try{
            t1.method();
        }catch(FileNotFoundException e){
            System.out.println(e);  //same as sout e plus tells us where exception occurs etc
        }
        System.out.println("rest of the code");
    }
}
