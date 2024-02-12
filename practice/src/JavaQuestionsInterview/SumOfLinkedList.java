package JavaQuestionsInterview;

import java.util.Arrays;
import java.util.LinkedList;

public class SumOfLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>(Arrays.asList(2,3,4,6,7,3,34,6));
        System.out.println(extracted(list));
    }

    private static int extracted(LinkedList<Integer> list) {
        int sum=0;
        for(Integer l: list){
            sum+=l;
        }
        return sum;
    }
}
