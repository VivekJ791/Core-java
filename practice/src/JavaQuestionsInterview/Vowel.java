package JavaQuestionsInterview;
//3. Write a Java program to check if a vowel is present in a string.
public class Vowel {
    public static void main(String[] args) {
        System.out.println(checkVowelPresentOrNot("gthybnmk"));
    }

    public static Boolean checkVowelPresentOrNot(String s){
        return s.toLowerCase().matches(".*[aeiou].*");
    }
}
