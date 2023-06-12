package CollectionFramework.Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class SetEg1 {
    public static void main(String[] args) {
        Integer []ll1= {23,45,17,19,18,20,90,97,87};
        Integer []ll2= {19,23,87,333,7,10,190,15};
        Set<Integer> s1=new HashSet<Integer>();
        Set<Integer> s2= new HashSet<Integer>();
        s1.addAll(Arrays.asList(ll1));
        s2.addAll(Arrays.asList(ll2));

        System.out.println("union");
        Set<Integer> union= new HashSet<Integer>(s1);
        union.addAll(s2);
        System.out.println(union);

        System.out.println("intersection");
        Set<Integer> intersection= new HashSet<Integer>(s1);
        intersection.retainAll(s2);
        System.out.println(intersection);

        System.out.println("difference");
        Set<Integer> difference= new HashSet<Integer>(s1);
        difference.removeAll(s2);
        System.out.println(difference);
    }
}