package JavaQuestionsInterview;

public class ReverseString {
    public static void main(String[] args) {
        String thisIsInput = reverse("This is input");
        System.out.println(thisIsInput);
    }
    public static String reverse(String input){
        StringBuilder output= new StringBuilder();
        for(int i=input.length()-1;i>=0;i--){
            output.append(input.charAt(i));
        }
        return output.toString();
    }
}
