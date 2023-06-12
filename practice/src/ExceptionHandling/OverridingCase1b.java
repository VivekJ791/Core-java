package ExceptionHandling;

class Anime{
    void display(){
        System.out.println(" Anime ");
    }
}
class Anime_name extends Anime{
    void display() throws NullPointerException{
        System.out.println("Null pointer exception occured ");
    }
}
public class OverridingCase1b {
    public static void main(String[] args) {
        Anime_name a= new Anime_name();
        a.display();
    }
}
