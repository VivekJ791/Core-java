package oops;
class fact{
    int fact(int n) {
        int facto=1;
        for (int i = 1; i <= n; i++) {
            facto = facto * i;
        }return facto;
    }
}
public class AnonymousObj {
    public static void main(String[] args) {
//        new fact().fact(4);
        System.out.println(new fact().fact(4));
    }
}
