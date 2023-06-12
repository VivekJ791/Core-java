package CollectionFramework.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEg {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm1= new TreeMap<>();
        tm1.put(3,"google");
        tm1.put(2,"bing");
        tm1.put(1,"brave");
        System.out.println(tm1.entrySet());


        for (Map.Entry<Integer,String> me:tm1.entrySet()) {
            System.out.println(me.getKey() +" " +me.getValue() );
        }
    }
}
