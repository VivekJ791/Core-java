package CollectionFramework.Set.HashSet;

import java.util.HashSet;

public class Book {
    int quantity;
    String name,author,publisher;
    Book(String n,String a,String p,int q){
        this.name= n;
        author=a;
        publisher=p;
        quantity=q;
    }
    public String toString(){
        return name+ " "+ author+ " "+ publisher+" "+ quantity;
    }
    public static void main(String[] args) {
        HashSet<Book> h1= new HashSet<Book>();
        Book b= new Book("Hunger games","suzaaneCollins","kodansa",100000);

        h1.add(b);
        System.out.println(h1);
        for (Book b1:h1
             ) {
            System.out.println(b1.name + b1.author + b1.publisher+ b1.quantity);
        }
    }
}
