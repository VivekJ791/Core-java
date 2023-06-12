package CollectionFramework.Map;
import java.util.Map;
import java.util.HashMap;

public class Mapeg1 {
    public static void main(String[] args) {

        Map<Integer,String> map1= new HashMap<>();
        map1.put(1,"rahul");
        map1.put(2,"james");
        map1.put(3,"vivek");
        map1.put(4,"hashim");
        System.out.println(map1);
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        System.out.println(map1.entrySet());

        map1.replace(4,"kallis");
        map1.replace(3,"ABD");
        System.out.println(map1);

        Map<Integer,String> map2= new HashMap<>();
        map2.put(5,"bruh");
        map2.put(3,"bro");
        map1.putAll(map2);
        System.out.println(map1);

        Map<Integer,String> map3=new HashMap<>(6,0.5f);
        map3.put(1,"lalit");
        map3.put(2,"breach");
        map3.put(3,"manutd");
        System.out.println(map3.size());
        map3.put(4,"tottenham");
        System.out.println(map3.size());
    }
}
