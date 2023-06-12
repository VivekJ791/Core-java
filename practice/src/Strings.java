import java.util.StringTokenizer;

public class Strings {
    public static void main(String[] args) {
//        String a="harry";
////        a="harry kane";
//        a.concat("kane");
//        System.out.println(a);
//        String str="son";
//        String str2="son";
//        String str3=new String("SON");
//        String str4="rahul";
//        System.out.println(str.equals(str2));
//        System.out.println(str.equals(str3));
//        System.out.println(str.equalsIgnoreCase(str3));
//        String str="lionel";
//
//        String str2=str.concat(" messi");
//        System.out.println(str2 );

        //String concatenation using format method
//        String str1= new String("8867");
//        String str2= new String("gates");
//        String st= String.format("%s%s",str1,str2);
//        System.out.println(st);

        // Collectors joining method
//        List<String> listOfStr=Arrays.asList("channel","remote","tv");
//        String str=listOfStr.stream().collect(Collectors.joining(","));
//        System.out.println(str);

        /*
        String Comparison methods

         */
        //1. by equals() method and by equalsIgnoreCase() method

//        String a= new String("sumeet");
//        String b= new String("SUMEET");
//        String c= new String("ronin");
//        System.out.println(a.equals(b)); // equals function only sees value not case
//        System.out.println(a.equalsIgnoreCase(b));//equalsIgnoreCase is case sensitive
//        System.out.println(a.equals(c));

        // 2. by using == operator : == operator compares reference not value
//        String a= "sumeet";
//        String b= "sumeet";
//        String c= new String("sumeet");
//        System.out.println(a==b); // if same value and no new object true
//        System.out.println(a==c);// if new object created even if same value = false

        //3. by using compareTo() method : it lexografically compares string
//        String a= "sumeet";
//        String b= "sumeet";
//        String c= "sumit";
//        System.out.println(a.compareTo(b)); // if same value then 0
//        System.out.println(a.compareTo(c)); // if a > b negative value
//        System.out.println(c.compareTo(a)); // if a < b positive value

        /*
        String Concatenation (too many ways )
         */

        //1. by + operator eg
//        String a= "harry";
//        System.out.println(a+" kane"); //this code is transformed into this by compiler :
//        // String a=(new StringBuilder()).append("harry").append("kane").toString();
//        System.out.println(40+40+"harry"+19+45); // + operators adds value but after string concatenates

        //2. by concat() method imp
//        String a= "bill";
//        String b= "gates";
//        String c=a.concat(b);
//        System.out.println(c);

        // now concatenation can be done in various ways like using StringBuilder append() method
        // stringbuilder is used because it is mutable can be changed
//        StringBuilder a=new StringBuilder("ronak");
//        StringBuilder b=new StringBuilder("jha");
//        StringBuilder c= a.append(b);
//        System.out.println(c.toString());// reason why we using toString because StrinBuilder can add int, char ,object and \
        //other values as well thus to represent main variable as string we use toString
        // Using format() method : used to specify format specifier

//        String a= "harry";
//        String b= "kane";
//        String c= String.format("%s%s",a,b); //joh bhi %s%s ke beach mei dalega would be shown between a and b
//        System.out.println(c);

        // Join method : join basically is same as format but
        // instead of format specifiers takes "separtor" and objects eg
//        String a= "mumbai";
//        String b= "indians";
//        String c= String.join(" ",a,b);
//        System.out.println(c);
// StringJoiner class : same as string.join but has prefix suffix adder as well you have to
//        apply add to the object like s.add('string')

//        StringJoiner s= new StringJoiner("seperator");
//        s.add("hello"
//        );
//        s.add(" world");
//        System.out.println(s);
// Collectors.joining() method :
//        List<String> liststr= Arrays.asList("harry","kane","company"); //create list of string array
//        String s= liststr.stream().collect(Collectors.joining("separtors"));// performs joining method
//        System.out.println(s.toString());

/*
STRING CONCATENATION ENDS
 */
//Substring in java : String class has substring() method
//        String a="sachin tendulkar";
//        System.out.println(a.substring(3));
//        System.out.println(a.substring(0,9));
//        System.out.println(a.substring(-1,222)); // this is will throw error cuz start index should not
        //be less than 0 and end index shouldnt be more than str.length()

        //split method in java
//        String a= "java is a fun programming language";
//        String []result= a.split(" ");
//
////        for(String str:result){
////            System.out.print(str);
////        } // or we could do this
//        System.out.println(Arrays.toString());

        //intern
//        String a= new String("ronin");
//        String b= new String("wronin");
//        String s= a.intern();
//        System.out.println(s);

        // STRING BUFFER
//       char []arr= new char[]{'a','b','c','d'};
//       StringBuffer s= new StringBuffer(Arrays.toString(arr));
//       System.out.println(s.reverse());

//        StringBuffer s= new StringBuffer();
//        System.out.println(s.capacity());
//        s.append("hello how was your day");
//        System.out.println(s.capacity());
//        s.ensureCapacity(14);
//        System.out.println(s);
//        long startTime= System.currentTimeMillis();
//        StringBuffer a= new StringBuffer("java");
//        for(int i=1;i<=1000;i++){
//            a.append("tpoint");
//        }
//        System.out.println("total time:" + (System.currentTimeMillis()- startTime)+"ms");
//
//        startTime=System.currentTimeMillis();
//        StringBuilder b= new StringBuilder("java");
//        for(int i=1;i<=1000;i++){
//            b.append("tpoint");
//        }


//        System.out.println("total time "+ (System.currentTimeMillis()- startTime)+"ms" );

//    }
//}
// class Student{
//    int roll_no;
//    String name;
//    String cityName;
//    Student(int roll_no,String name,String cityName){
//        this.roll_no=roll_no;
//        this.name=name;
//        this.cityName= cityName;
//
//    }
//    public String toString(){
//        return roll_no+""+name+""+cityName;
//    }
//
//public static void main(String []args){
//    Student s1= new Student(21,"Krishna","vrindavan");
//        System.out.println(s1);
//        StringTokenizer st= new StringTokenizer("hello , this is strings chapter ");
//        while(st.hasMoreTokens()){
//            System.out.println(st.nextToken());
//        }
//        System.out.println(st.nextToken());
                }
}



