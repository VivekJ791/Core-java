package recursion;

public class recursioninfinite {
    static int count=0;
    static void count(){
        count++;
        if(count<=4){
            System.out.println("count:"+ count);
            count();
        }
    }
//    static void infinite(){
//        System.out.println("hello");
//        infinite();
//    }

    public static void main(String[] args) {
//        infinite();
        count();
    }
}
