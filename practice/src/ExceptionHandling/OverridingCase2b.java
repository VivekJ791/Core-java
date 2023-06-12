package ExceptionHandling;
class Plastic{   // code runs kyuki exception of parent class is bigger than exp of child class
    void talk() throws RuntimeException{
        System.out.println(" this is plastic class");

    }
}
class Bottle extends Plastic{
    void talk() throws ArithmeticException{  // agar arithmetic exp ko runtime exp kardiya toh bhi
        //run  hoga and agar void talk() se kuch exp throw nhi karaya toh bhi run hoga
        System.out.println(" this is bottle class");

    }
}
public class OverridingCase2b {
    public static void main(String[] args) {
//        Bottle b= new Bottle();   // dono tarike se kar sakte hai try catch mei dalke aur
                                      // uske bina bhi
//        try{
//            b.talk();
//        }catch (Exception e){
//            System.out.println(e);
//        }

//        Bottle b= new Bottle();
//        b.talk();
    }
}
