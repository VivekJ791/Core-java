package CallbyValue;

import java.sql.Ref;

public class Reference {
     int n=10;
    static void change(Reference ref){
        ref.n=ref.n+1;
        System.out.println("in method n:"+ref.n);
    }
    public static void main(String[] args) {
        Reference r= new Reference();
        System.out.println("before change : "+r.n);
        change(r);
        System.out.println("After change: "+ r.n);
    }
}
