package ExceptionHandling;

import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionCheckedEg1 {
    public static void main(String[] args) {
        PrintWriter n;
//        n=new PrintWriter(System.out); //eg of printwriter
//        n.println("lol");
//        n.printf("hey this is %s","vivek");
//        n.append("bruh");
//        n.close();
                try{
            n=new PrintWriter("file.txt");
        }catch (IOException e){
            System.out.println(e);

        }
        System.out.println("file saved");
    }
}
