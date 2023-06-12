package CollectionFramework.LinkedList;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FrontPage {
    public FrontPage(){
        Scanner s= new Scanner(System.in);
        System.out.println("1.Admin Login");
        System.out.println("2.Customer Login");
        int input= s.nextInt();
        if(input==1){
            //Admin.login()
            System.out.println("admin");
        } else if (input==2) {
            //Customer.LoginOptions
        }else{
            System.out.println("enter a valid input");
        }
    }


}
