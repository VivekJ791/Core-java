package ExceptionHandling;

import java.io.IOException;

class Electronics{
    void display() throws IOException {
        System.out.println("electronics");
    }
}
//class Fan extends Electronics{     // entire code throws error cause cant override
//    void display() throws Exception{
//        System.out.println("fan");
//    }
//}
//public class OverridingCase2a {
//    public static void main(String[] args) {
//        Fan f= new Fan();
//        f.display();
//    }
//}
