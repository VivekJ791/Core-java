package CollectionFramework.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedhashmapBook {
    String name,author;
    double rating;
    int quantity;
    LinkedhashmapBook(String n,String a,double r,int q){
        name=n;
        author=a;
        rating=r;
        quantity=q;
    }
//        public String toString(){
//        return name+" "+ author+ " "+rating+" "+quantity;
//    }
    public static void main(String[] args) {
        LinkedhashmapBook b= new LinkedhashmapBook("stop worrying and start  living","dale",7.2,8000);
        LinkedHashMap<Integer,LinkedhashmapBook> lhm= new LinkedHashMap<Integer,LinkedhashmapBook>();
        lhm.put(1,b);
        System.out.println(b.author);
        for (Map.Entry<Integer,LinkedhashmapBook> book:lhm.entrySet()
             ) {
            System.out.println(book);
            System.out.println(book.getKey());
            LinkedhashmapBook l= book.getValue();
            System.out.println(l.name);
            LinkedhashmapBook record= book.getValue();
            System.out.println(record.name +" "+ record.author+" "+ record.rating);

        }
    }
}