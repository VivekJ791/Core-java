package ExceptionHandling.CustomException;

import java.util.Scanner;

class LoginCheck extends Exception{
    String str;
    public LoginCheck(String str){
        super(str);
        this.str= str;
    }
}
public class Main {
    Scanner sc= new Scanner(System.in);
    String user=sc.next();
    Scanner s= new Scanner(System.in);
    String password=s.next();
    void method(String user,String password)throws LoginCheck{
        if(user!="user1" || password!="1234"){
            throw new LoginCheck("no user with this id "+ user);
        }   else {
            System.out.println("you are logged in ");
        }
    }
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        String user=sc.next();
//        String password=sc.next();
        Main m= new Main();
        try{
            m.method(m.user,m.password);
//            if(user!="user1" || password!="1234"){
//                throw new LoginCheck("no user with this id "+ user);
//            }
//            else if (user=="user1" || password=="1234") {
//                System.out.println("you are logged in ");
//            }
        }catch (LoginCheck e){
            System.out.println(e);
        }

    }
}