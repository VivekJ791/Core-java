package CollectionFramework.LinkedList;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IfExist {
    public static void main(String[] args) {
//        String arr[]={"lokesh","rahul","pooran","faf","sachin tendulkar"};
//        LinkedList<String> ll= new LinkedList<>(List.of(arr));
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter your name");
//        String s=sc.nextLine();
//        if(ll.contains(s)){
//            System.out.println("name present");
//        }else{
//            System.out.println("notpresent");
//        }
        String name1;
        int id1,age1;

        Scanner in = new Scanner(System.in);

//I can input name if input is before all integers

        System.out.println("Enter id");
        id1 = in.nextInt();

        in.nextLine();
        System.out.println("Enter name");       //Problem here, name input gets skipped
        name1 = in.nextLine();

        System.out.println("Enter age");
        age1 = in.nextInt();
    }
}
