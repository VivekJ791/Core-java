package TryWithResource;

public class TryWithResource {
    public static void main(String[] args) {
        try{
            Animal a= new Animal("tommy","bark",4);
            Animal a2= new Animal("kitty","meow",-1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class Animal{
    String name;
    String sound;
    Integer legs;

    public Animal(String name, String sound, Integer legs) {
        this.name = name;
        this.sound = sound;
        if (legs < 0) {
            throw new IllegalArgumentException("Number of legs must be non-negative");
        }
        this.legs = legs;
    }
}
