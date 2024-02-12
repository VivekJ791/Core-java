package JavaQuestionsInterview;

public class StringImmutable {
    public static void main(String[] args) {
        String s= "naruto";
        s.concat("bruh");
        String s2= "sasuke";
        s=s2;
        System.out.println(s==s2);
    }
}
