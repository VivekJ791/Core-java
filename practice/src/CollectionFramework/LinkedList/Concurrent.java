package CollectionFramework.LinkedList;

import java.util.LinkedList;

public class Concurrent {
    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();
        ll.add(45);
        ll.add(8);
        ll.add(56);
        ll.add(89);

//        for (Integer i:ll
//             ) {
//            ll.remove(1);
//            System.out.println(i);
//        }

        for(Integer i=0;i<ll.size()-1;i++){
            ll.remove(1);
            System.out.println(ll.get(i));
        }
    }
}
