package ExceptionHandling;

import java.util.Scanner;

class UserDefinedException extends Exception
{
    String str;
    public UserDefinedException(String str)
    {
        // Calling constructor of parent Exception
//        super(str);
        super(str);
//        this.str= str;
    }
    public String toString(){
        return str;
    }
    }

// Class that uses above MyException
public class TestThrow3
{ void method(String str) throws UserDefinedException{
    if(str.length()>8){
        throw new UserDefinedException("your input is more than 8 letters ");
    }else{
        System.out.println("correct input");
    }
}

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string input");
        String s=sc.next();
        TestThrow3 t=new TestThrow3();
        try
        {
            // throw an object of user defined exception
//            throw new UserDefinedException("This is user-defined exception");
            t.method(s);
        }
        catch (UserDefinedException ude)
        {
            System.out.println("Caught the exception");
            // Print the message from MyException object
            System.out.println(ude.getMessage());
        }
    }
}