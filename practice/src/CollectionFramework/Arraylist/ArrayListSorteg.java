package CollectionFramework.Arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ArrayListSorteg {
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>();
        nums.add(4);
        nums.add(9);
        nums.add(18);
        nums.add(14);
        nums.add(-2);
        nums.add(200);//ek baar add hogya toh add stmts ko upar niche karke kuch nhi hoga

        //Another way of doing this without comparator
        Collections.sort(nums);
        System.out.println("Sorted without Compartor:"+ nums);
        System.out.println("unsorted arraylist: "+nums);
        nums.sort(Comparator.reverseOrder());
        System.out.println("reverse sorted Arraylist: "+nums);
        nums.sort(Comparator.naturalOrder());
        System.out.println("sorted :"+ nums);
    }
}
