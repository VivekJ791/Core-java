package JavaQuestionsInterview;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(checkPrimeOrNot(7));
    }

    public static Boolean checkPrimeOrNot(int num){
        if(num==0 || num==1){
            return false;
        }
        if (num == 2) {
            return true;
        }
        for(int i=3;i<=num/2;i++){
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
}
