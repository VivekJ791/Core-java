package CollectionFramework.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class QueqeLikeLinkedList {
    public static void main(String[] args) {
        String arr[]={"hello","namaste","whats up","greeting","konnichiwa","anyeong","salamat","ni hao"};
        LinkedList<String> queuelike= new LinkedList<>(List.of(arr));
        Integer arr2[]={10,20,30,40,50};
        LinkedList<Integer> ll1=new LinkedList<>(List.of(arr2));
        System.out.println(ll1);
//        queuelike.offer("nice");//list method that act like queue insetion
//        queuelike.offer("lastresort");
////        System.out.println(queuelike.pop()); //removes first inserted element
////        System.out.println(queuelike.pop());
//        queuelike.poll();
//        System.out.println(queuelike);
//queuelike.pollFirst();
//        System.out.println(queuelike);
//        queuelike.pollLast();
//        System.out.println(queuelike);
//        queuelike.remove();
//        System.out.println(queuelike);
//        queuelike.removeFirst();
//        System.out.println(queuelike);
//        queuelike.removeLast();
//        System.out.println(queuelike);
    }
}
