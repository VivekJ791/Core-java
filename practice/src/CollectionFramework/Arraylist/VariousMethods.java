package CollectionFramework.Arraylist;

import java.util.ArrayList;

public class VariousMethods {
    public static void main(String[] args) {
        ArrayList<Integer> num= new ArrayList<>();
        num.add(23);
        num.add(45);
        num.add(89);

        System.out.println("does the arraylist contains 45 true or false:"+num.contains(45));

        //remove
        System.out.println(num.remove(Integer.valueOf(23)));
        System.out.println(num);
    }
}
