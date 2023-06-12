package CollectionFramework.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrent {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> lhm= new ConcurrentHashMap<>();
        lhm.put(1,"boat");
        lhm.put(3,"senheiser");
        lhm.put(2,"noise");
        lhm.put(4,"one plus");


        for (Map.Entry<Integer,String> m:lhm.entrySet()) {
            lhm.put(1, "vivek");
            lhm.remove(2);
            System.out.println(m.getKey() +" " + m.getValue());
        }

        /*
        if we are overriding equals hashscode bhi override karna padega ,kyuki only overriding equals
        will make 2 values/buckets on same index/memory,
        and if only overriding hashcode it will not be able to tell if same key exist cause equals method not
        overrided

         */

//        for(int i=0;i<= lhm.size()-1;i++){
//            lhm.put(1, "vivek");
//            lhm.remove(2);
//            System.out.println(lhm);
//        }

    }
}
