public class operators {
    public static void main(String []args){
        int a=20;
        int b=-5;
        System.out.println(~a);//minut of all the postives which starts from 0//
        System.out.println(~b);//postive of all negative which starts from 0//

        //left shift operators
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.println(20<<2);//20*2^2=20*4=80
        System.out.println(15<<4);//15*2^4=15*16=240

        // right shift operators
        System.out.println(10>>2);//10/2^2=10/4=2
        System.out.println(20>>2);//20/2^2=20/4=5
        System.out.println(20>>3);//20/2^3=20/8=2

        //For positive number, >> and >>> works same
        System.out.println(20>>2);
        System.out.println(20>>>2);
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20>>2);
        System.out.println(-20>>>2);

        //logical operators || and |
        int x=25;
        int y=20;
        int z=30;
        System.out.println(x>y | z>y);

        //ternary operators
        int min=(x<y)?x:y;
        System.out.println(min);

        int res= (x>y)?(x-y):(y-x);
        System.out.println(res);

        short q=23;
        short r=2;
        // cant do q=q+r ==error have to do this instead
        //Type casting = (datatype)
        q=(short)(q+r);
        System.out.println(q);

        int arr[]={23,43,53,55,33,2};
        for(int element:arr){
            System.out.println(element);
        }



    }
}
