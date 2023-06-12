package CollectionFramework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReverseIterate {
    public static void main(String[] args) {
        String arr[]={"brah","hello","namaste","greetings"};
        LinkedList<String> ll= new LinkedList<>(List.of(arr));
        Iterator<String> i= ll.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
