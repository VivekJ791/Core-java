package CollectionFramework.Map;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm= new LinkedHashMap<>();

        lhm.put(1,"boat");
        lhm.put(2,"senheiser");
        lhm.put(3,"noise");
        lhm.put(4,"one plus");

//        lhm.remove(2);
//        LinkedHashMap<Object,Object> sample1[]={{"sting","brah"},{"s ","brah"}};
//        LinkedHashMap<Object,Object>  lhm3= new LinkedHashMap<>(sample1);
//
//       lhm3.putAll(Arrays.asList(sample1));
//     System.out.println(lhm.entrySet());
//       try{
//           for (Map.Entry<Integer,String> m:lhm.entrySet()) {
//               lhm.put(1, "vivek");
//     System.out.println(m.getKey() +" " + m.getValue());
//               lhm.remove(2);
//
//           }
//       }catch(Exception e){
//           System.out.println(e);
//       }

//        for (Map.Entry<Integer,String> m:lhm.entrySet()) {
//                lhm.put(1, "vivek");
//                lhm.remove(2);
//                System.out.println(m.getKey() +" " + m.getValue());
//            }
//
        for(int i=1;i<=lhm.size();i++){
           System.out.println(lhm.size());
            System.out.println(lhm);
            lhm.put(1, "vivek");
            lhm.remove(2);
            System.out.println(lhm.get(i));
        }

//        LinkedHashMap<Integer,String> lhm1= new LinkedHashMap<>();
//        lhm1.put(2,"boltt");
//        lhm1.put(5,"crossbeats");
//        lhm1.put(6,"ambrane");
//        lhm.putAll(lhm1);
//        System.out.println(lhm.entrySet());
//
//        lhm.remove(2);
//        System.out.println(lhm);
    }
}
