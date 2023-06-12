package ExceptionHandling.CustomException;

import java.util.Scanner;

//class AgeInvalidException extends Exception {
//    String age;
//
//    AgeInvalidException(String age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "AgeInvalidException [age=" + age + "]";
//    }
//
//}
//
//public class UserDefineException {
//    void voter(int age) throws AgeInvalidException {
//        if (age < 18) {
//            throw new AgeInvalidException("You are not eligible for Voting");
//
//        } else {
//            System.out.println("You are eligible for Voting");
//        }
//
//    }
//
//    public static void main(String[] args) throws AgeInvalidException {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Age:");
//        int age = sc.nextInt();
//        UserDefineException obj = new UserDefineException();
//
//        obj.voter(age);
class AgeInvalidException extends Exception {
    String age;

    AgeInvalidException(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "AgeInvalidException [age=" + age + "]";
    }

}

public class UserDefineException {
    void voter(int age) throws AgeInvalidException {
        if (age < 18) {
            throw new AgeInvalidException("You are not eligible for Voting");

        } else {
            System.out.println("You are eligible for Voting");
        }

    }

    public static void main(String[] args) throws AgeInvalidException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age:");
        int age = sc.nextInt();
        UserDefineException obj = new UserDefineException();

        obj.voter(age);
    }
}
