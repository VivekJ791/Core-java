package CollectionFramework.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {
    public static void main(String[] args) {
        String s = new String("1");
//        HashSet<Object> names= new HashSet<>();
        Set<Object> names= new HashSet<>();
        names.add("ronin");
        names.add("batman");
        names.add("robin");
        names.add("alex");
//        names.add(1);
//        names.add(null);
//        names.add(null);
//        String st= null;
//        names.add(st);

//        for (Object s1:names
//             ) {
//            System.out.println(s1);
//        }


        Iterator<Object> i=names.iterator();
        for (int j=0;j<=3;j++){
            System.out.println(i.next());
        }
//        while(i.hasNext()){  //reason why we use hasNext is because above for loop
        // will throw an error if j<=4 cuz it goes inside the loop but i.next will give error cuz no
        //next element
//            System.out.println(i.next());
//            System.out.println(i.next());
//        }
//        names.remove("alex");
//        System.out.println(names);
//
//        HashSet<String> names2= new HashSet<String>();
//        names2.add("cat");
//        names2.add("fairy");
//        names.add("norman");
//        names.addAll(names2);
//        System.out.println(names);
//
//        names.remove(1);
//        System.out.println(names);

    }
}
