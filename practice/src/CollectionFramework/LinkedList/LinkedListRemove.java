package CollectionFramework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListRemove {
    public static void main(String[] args) {
        LinkedList<String> ll1=new LinkedList<>();
        ll1.add("rohit");
        ll1.add("shikar");
        ll1.add("virat");
        ll1.add("surya");
        ll1.add("hardik");
        ll1.add("virat");
        ll1.add("shami");
        ll1.add("rohit");
        System.out.println(ll1);

        ll1.remove("shami");
        System.out.println(ll1);

        ll1.remove(4);
        System.out.println(ll1);

        LinkedList<String> ll2=new LinkedList<>();
        ll2.add("johnson");
        ll2.add("micheal");

        ll1.addAll(ll2);
        System.out.println(ll1);

        ll1.removeAll(ll2);
        System.out.println(ll1);

        ll1.removeFirst();
        System.out.println(ll1);

        ll1.removeLast();
        System.out.println(ll1);

        ll1.removeFirstOccurrence("virat");
        System.out.println(ll1);

        ll1.removeLastOccurrence("virat");
        System.out.println(ll1);

        ListIterator<String> itr= ll1.listIterator(ll1.size());
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }

        System.out.println("using descending iterator");
        Iterator it= ll1.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
