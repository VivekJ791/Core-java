package CollectionFramework.LinkedList;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n= sc.nextInt();
//        int count=1;
        while(n!=0){
            System.out.println("enter number:");
            n=sc.nextInt();
//            count++;
            System.out.println("your entered number is:"+n);
        }

//        do{
//            System.out.println("enter number");
//            n=sc.nextInt();
//        System.out.println("number entered "+n);
//        }while(n!=0);



//        int arr[]=new int[10];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//            if(arr[i]==0){
//                break;
//            }else{
//                System.out.println("entered number is "+arr[i]);
//            }
//        }
    }
}
