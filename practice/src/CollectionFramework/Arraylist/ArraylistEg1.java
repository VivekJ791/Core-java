package CollectionFramework.Arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArraylistEg1 {
    public static void main(String[] args) {
        List<String> animes=new ArrayList<>();
        animes.add("My Hero Academia");
        animes.add("Aot");
        animes.add("FMAB");
        animes.add("Vinland Saga");
        animes.add("naruto");
        System.out.println("Anime Names:"+animes);

        System.out.println(animes.get(3));
        System.out.println(animes.set(3,"Peakland Saga"));

        animes.remove(4);
        Iterator iterate= animes.iterator();
        while(iterate.hasNext()){
            System.out.println("using while loop and iterator ");
            System.out.println(iterate.next());
        }

        System.out.println("using foreach loop");
        for (String s:animes) {
            System.out.print(s+ ", " );
        }
        System.out.println();

        System.out.println("using for loop");
        for(int i=0; i<animes.size();i++){
            System.out.println(animes.get(i));
        }
        System.out.println("using list iterator interface");// list iterator or iterator mei ye diff hai
        //ki iterator sirf forward jaata hai and listItertor dono direction mei i.e previous ,hasNext
        ListIterator<String> list=animes.listIterator(animes.size());
        while(list.hasPrevious()){
            System.out.println(list.previous());
        }
    }
}
