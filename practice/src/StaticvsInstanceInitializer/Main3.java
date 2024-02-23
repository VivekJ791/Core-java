package StaticvsInstanceInitializer;


import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        for(int i=1;i<=1;i++){
            System.out.println("5th Index:"+ list.get(4));
        }
    }
}
