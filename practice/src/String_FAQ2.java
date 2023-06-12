

public class String_FAQ2 {
// Program to reverse each word of String
//    public static String reverse(String str){
//        String words[]=str.split(" ");
//        String reverse="";
//        for(String w:words){
//            StringBuilder sb= new StringBuilder(w);
//            sb.reverse();
//            reverse+=sb.toString()+" ";
//        } return reverse.trim();
//    }
    public static String tOOGLEword(String str){
        String []words=str.split("\\s");
        String toggle="";
        for(String s:words){
            String firstWord=s.substring(0,1);
            String remaining=s.substring(1);
            toggle+= firstWord.toLowerCase()+remaining.toUpperCase()+" ";
        }return toggle.trim();
    }
    public static void main(String []args){
        String_FAQ2 st= new String_FAQ2();
        String str=st.tOOGLEword("That was indeed good morning");
//        System.out.println(st.tOOGLEword("that was indeed a good morning"));
        System.out.println(str);
//        System.out.print(String_FAQ2.reverse("this is javatpoint"));
//        System.out.print(String_FAQ2.tOOGLEword("this is javatpoint"));
//        int var=2;
//        String sop="";
//        switch(var){
//            case 1: sop="one";
//            break;
//            case 2: sop="two";
//            break;
//            case 3: sop= "three";
//            break;
//            default: System.out.println("invalid");
//        } System.out.println(sop);
    }
}
