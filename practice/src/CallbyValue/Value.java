package CallbyValue;

public class Value {
    static void change(int n) {
        n = n + 1;
        System.out.println("Number in method:" + n);
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println("before change " + n);
        change(n);
        System.out.println("After Change "+ n);
    }

}