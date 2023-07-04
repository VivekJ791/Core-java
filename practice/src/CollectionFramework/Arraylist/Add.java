package CollectionFramework.Arraylist;

import java.util.ArrayList;
public class Add {
    public static void main(String[] args) {
        ArrayList<Integer> al1= new ArrayList<>();
        al1.add(13);
        al1.add(17);
        al1.add(14);
        System.out.println(al1);

        ArrayList<Integer> al2= new ArrayList<>();
        al2.add(78);
        al2.add(90);
        al2.add(100);
        al2.addAll(2,al1); //index 2 pe al1 add ho jayega
        System.out.println(al2);
    }
}
