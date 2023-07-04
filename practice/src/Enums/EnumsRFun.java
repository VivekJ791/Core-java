package Enums;
enum Month{  //enum outside the class
    JAN,FEB,MAR,APR;
}

public class EnumsRFun {

    enum Flavor{ //enum inside class
        VANILLA,BUTTERSCOTCH,CHOCOLATE,MANGO,STRAWBERRY;
        private String flavor;
        Flavor(String a){
            flavor=a;
        }

        Flavor() {

        }
    }
    static String[] months={"JAN","FEB","MAR","APR"};
    public static void main(String[] args) {
//        System.out.println(months[0]);
//        System.out.println(months[1]);
//        System.out.println(months[2]);
//        System.out.println(months[3]);
//        System.out.println(Month.FEB);
//        System.out.println(Month.valueOf("FEB"));
//        System.out.println(Month.valueOf("FEB").ordinal());
//        System.out.println(Month.values());

        Month m = Month.APR;
        switch (m){
            case JAN -> {
                System.out.println("month is april : Makar sankranti,republic day");
                break;
            }
            case FEB -> {
                System.out.println("month is Feb: Valentines Day");
                break;
            }
            case APR -> {
                System.out.println("April :  Your lie in april");
                break;
            }
            case MAR -> {
                System.out.println("Mar: March comes in like a lion n");
            }

        }
    }
}
