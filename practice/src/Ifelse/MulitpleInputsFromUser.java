package Ifelse;

import java.util.Scanner;

public class MulitpleInputsFromUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // create int array of size 5
        int lang[] = new int[5];

        // read input
        System.out.println("Enter 5 Language Name:");
        for (int i = 0; i < 5; i++) {
            lang[i] = scan.nextInt();
            if(lang[i]==0){
                break;
            }else{
                System.out.println("entered number"+lang[i]);
            }

        }

    }
}
