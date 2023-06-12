package CollectionFramework.Map;

import java.util.Map;
import java.util.TreeMap;

public class Book {
    int quantity;
    String name,author,genre;
    Book(String n,String a,String g,int q){
        name=n;
        author=a;
        genre= g;
        quantity= q;
    }

//    public String toString(){
//        return name+" "+ author+ " "+genre+" "+quantity;
//    }
    public static void main(String[] args) {
        TreeMap<Integer,Book> tm= new TreeMap<>();
        Book b1= new Book("Hunger games","suzanne collins","fictional",1500);
        Book b2= new Book("gone girl","blake pierce","fictional",5000);
        tm.put(1,b1);
        tm.put(2,b2);

        for (Map.Entry<Integer,Book> m: tm.entrySet()
             ) {
            System.out.println(m.getKey().toString() +" "+ m.getValue().toString());
        }
    }
}
