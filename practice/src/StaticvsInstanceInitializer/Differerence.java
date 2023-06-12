package StaticvsInstanceInitializer;

/*Static initialser block is used for initialising static variables,trying to initialize other variables will
 give an error, it is executed before main mthod,it cannot be used inside main method else error.
also we can have multiple static block ,they'll be executed in order they appear in code,also parents static
block is executed before child .
instance initializer block is used for initializing non static variables ,u can also initialize
 static variables throuogh it,it can be used inside main
method , or after object creation it will still execute first

 */
public class Differerence {
   static int i=9;
     static int j;
    static{
        System.out.println("im executed before main method");
        j++;
        System.out.println(j);
    }
    static int increase(){
        j++;
        return j;
    }
    Differerence(String t){
        System.out.println(t);
        System.out.println("constructor called" );
    }
    String s;



    public static void main(String[] args) {

        Differerence d= new Differerence("brah");
        Differerence d1= new Differerence("lol");
        {
            System.out.println("im executed before object is created");
            i+=1;
        }
        System.out.println(d.i);
        System.out.println(d.j);
        d1.increase();//yehi statment soutd.i se pehle diya rehta tha toh dono ke liye static j=2 hota
        System.out.println(d1.j);
        System.out.println(d1.i);
        System.out.println(i);
    }
}
