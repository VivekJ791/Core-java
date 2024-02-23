package JavaQuestionsInterview;
//Find the 2nd largest number in array
public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr= {3,2,4,45,89,48,88,78,60,68};
//        int highest=arr[0];
//        int secondHighest=arr[1];
//        for(int i=2;i<=arr.length-1;i++){
//            if(highest<arr[i]){
//                highest=arr[i];
//            } else if ( secondHighest<arr[i] ) {
//                secondHighest=arr[i];
//            }
//        }
//        System.out.println("2nd highest value is : " +secondHighest);
        int highest = 0;
        int secondHighest = 0;
        for (int i : arr) {
            if (i > highest) {
//                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }
        }
        System.out.println("second higheest is :" + secondHighest);
    }
}
