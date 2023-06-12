package CollectionFramework.Set.HashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

public class HashSeteg2 {
    public static void main(String[] args) {

        Integer sample1[]={25,23,90,170,88,89,750};
        Integer sample2[]={67,90,45,25,78,89,230};
        HashSet<Integer> set1= new HashSet<Integer>();
        set1.add(23);
        set1.add(15);
        set1.add(8);
        set1.add(29);

        HashSet<Integer> set2= new HashSet<Integer>();
        set2.add(15);
        set2.add(29);
        set2.add(18);
        set2.add(79);

        HashSet<Integer> union= new HashSet<Integer>(set1);
        union.addAll(set2);
        System.out.println(union);

        HashSet<Integer> intersection= new HashSet<Integer>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        HashSet<Integer> difference= new HashSet<Integer>(set1);
        difference.removeAll(set2);
        System.out.println(difference);

        System.out.println(set1.containsAll(set2));
        System.out.println(set1.contains(23));
        System.out.println(set1.isEmpty());
        System.out.println(set1.size());


        HashSet<Integer> set3= new HashSet<Integer>(List.of(sample1));
        HashSet<Integer> set4= new HashSet<Integer> ();
        set4.addAll(Arrays.asList(sample2));
        System.out.println(set3);
        System.out.println(set4);

    }
}
