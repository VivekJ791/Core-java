package oops;

class CounterStatic{
    static int count=0;
    static void counterMethod(){
        count++;
        System.out.println(count);
    }
}
public class Counter {
    //Java Program to demonstrate the use of an instance variable
//which get memory each time when we create an object of the class.
//        static int count=0;//will get memory each time when the first instance is created
    //basically if static value changes for one object ,the changed value is used in next object
    //as compare to instance variable where changed value wont be assigned to next object

//        void CounterCount(){
//            count++;//incrementing value
//            System.out.println(count);
//        }

        public static void main(String args[]){
//Creating objects
            CounterStatic c1=new CounterStatic();
            c1.counterMethod();
            c1.counterMethod();
            CounterStatic c2=new CounterStatic();
            c2.counterMethod();
            CounterStatic c3=new CounterStatic();
            c3.counterMethod();
//            CounterStatic.counterMethod();
//            CounterStatic.counterMethod();
//            CounterStatic.counterMethod();
        }
    }