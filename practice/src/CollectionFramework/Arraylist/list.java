package CollectionFramework.Arraylist;
import java.util.List;
import java.util.ArrayList;
public class list {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Numbers:"+numbers);
        int a= numbers.get(1);
        System.out.println("got :"+a);
        int b=numbers.remove(2);
        System.out.println("removed number "+ b );
        System.out.println(numbers.indexOf(4));
    }
}
