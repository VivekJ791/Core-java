package CollectionFramework.LinkedList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEgAdd {
    public static void main(String[] args) {
        LinkedList<String> ll1= new LinkedList<>();
        ll1.add("Tarik");
        ll1.add("Tenz");
        ll1.add("yay");
        System.out.println("linked list before adding "+ll1);
        ll1.add(2,"kyedea");
        System.out.println("linked list after add(1,sfs)" +ll1);

        LinkedList<String> ll2=new LinkedList<>();
        ll2.add("jolz");
        ll2.add("ninja");
        ll2.add("flex");
        ll1.addAll(2,ll2);
        System.out.println("linked list after adding ll2 to ll1"+ll1);

        ll1.addFirst("All these are ");
        ll1.addLast("esports players");

        System.out.println(ll1);
    }
}
