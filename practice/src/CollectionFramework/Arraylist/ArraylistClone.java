package CollectionFramework.Arraylist;

import java.util.ArrayList;

public class ArraylistClone {
    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(5);
        nums.add(2);
        nums.add(9);
        nums.add(1);
        System.out.println("Array list:"+nums);

        System.out.println("return value "+nums.clone());
        ArrayList<Integer> clone= (ArrayList<Integer>)nums.clone();
        System.out.println("cloned arraylist: "+ clone);
    }
}
