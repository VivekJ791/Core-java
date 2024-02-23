package StaticvsInstanceInitializer;

import java.util.Scanner;

public class StaticMethod {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter number 1 and number 2 ");
        int s1= s.nextInt();
        int s2= s.nextInt();
        System.out.println("additon of two number is this :"+add(s1,s2));

        StaticMethod staticMethod= new StaticMethod();
        staticMethod.employeeName="rahul";
        System.out.println(CompanyName);
    }

    static int add(int a,int b){
        return a+b;
    }
    static String CompanyName="FOX";
    String employeeName;
}
