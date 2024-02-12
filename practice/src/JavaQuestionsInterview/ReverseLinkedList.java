package JavaQuestionsInterview;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>(Arrays.asList(2,3,4,5,6,7,8,9,null,0));
        LinkedList<Integer> list2= new LinkedList<>();

        list.descendingIterator().forEachRemaining(list2::add);
        System.out.println(list2);
    }
}
