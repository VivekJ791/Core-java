package CollectionFramework.LinkedList;

import java.util.LinkedList;

public class Anime {
    String name,studio,genre;
    double rating;
    Anime(String name,String studio,String genre,double rating){
        this.name=name;
        this.studio=studio;
        this.genre=genre;
        this.rating=rating;
    }
    public String toString(){
        return name +" "+ genre+ " "+ genre+" "+rating;
    }

    public static void main(String[] args) {
        Anime a=new Anime("Demon slayer","Ufotable","Action",7.5);
        Anime b=new Anime("Vinland saga","Mappa","Seinen",8.5);
        Anime c= new Anime("Mob Psycho 100","bones","Seinen",8.7);
        LinkedList<Anime> names=new LinkedList<>();
        names.add(a);
        names.add(b);
        names.add(c);
        System.out.println(names.toString());
        for (Anime n:names
             ) {
            System.out.println(n.name+" "+ n.genre+ " "+ n.genre+" "+n.rating);
        }

        System.out.println("printing without n.name n.genre n.rating");
        for (Anime n:names
        ) {
            System.out.println(n);
        }
    }
}
