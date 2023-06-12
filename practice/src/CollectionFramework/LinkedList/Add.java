package CollectionFramework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Add {
    public static void main(String[] args) {
        LinkedList<Integer> l1= new LinkedList<>();
        l1.add(67);
        l1.add(8);
        l1.add(44);
        Iterator<Integer> iter= l1.iterator();
        for (int i:l1) {
            System.out.println(i);
        }
    }
}
