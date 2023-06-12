package CollectionFramework.Map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class navigable {
    public static void main(String[] args) {
        NavigableMap<Integer,String> nm= new TreeMap<>();
        nm.put(1,"one");
        nm.put(2,"two");
        nm.put(4,"four");
        nm.put(3,"three");
        nm.put(5,"five");


        System.out.println(nm.headMap(2));
        System.out.println(nm.tailMap(3));
        System.out.println(nm.descendingMap());
        System.out.println(nm.descendingKeySet());
        System.out.println(nm.subMap(1,true,4,false));
        System.out.println(nm.subMap(1,4));
        System.out.println(nm.ceilingEntry(3));
        System.out.println(nm.ceilingKey(3));
        System.out.println(nm.floorEntry(4));
        System.out.println(nm.floorKey(4));
    }
}
