package JavaQuestionsInterview;

public class InterChangeValue {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        int c;
        //without 3rd
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+""+ b);

        //with 3rd
        c=a;
        a=b;
        b=c;
        System.out.println(a+""+b);
    }
}
