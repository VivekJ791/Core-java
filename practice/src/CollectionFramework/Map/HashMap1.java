package CollectionFramework.Map;
import java.util.HashMap;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm1= new HashMap<>();
        hm1.put("one",1);
        hm1.put("two",2);
        hm1.put("three",3);
        hm1.putIfAbsent("four",4);
        System.out.println(hm1);
        HashMap<String,Integer> hm2= new HashMap<>();
        hm2.putIfAbsent("five",5);
        hm1.putAll(hm2);
        System.out.println(hm1);
        hm1.remove("two",2);
        System.out.println(hm1);
        hm1.remove(1);
        System.out.println(hm1);
    }
}
