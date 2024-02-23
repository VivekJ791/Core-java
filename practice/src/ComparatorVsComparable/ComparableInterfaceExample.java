package ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableInterfaceExample implements Comparable<ComparableInterfaceExample>{
    String name;
    int age;
    double salary;

    public ComparableInterfaceExample(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(ComparableInterfaceExample cie) {
        return Double.compare(this.salary,  cie.salary);
    }
    public static void main(String[] args) {
        ArrayList<ComparableInterfaceExample> list= new ArrayList<>();
        list.add(new ComparableInterfaceExample("rahul",26,30000.00));
        list.add(new ComparableInterfaceExample("rohit",22,1200.00));
        list.add(new ComparableInterfaceExample("naruto",45,89000.00));
        Collections.sort(list);
        for (ComparableInterfaceExample c: list){
            System.out.println(c.age +" " +c.salary +" "+c.name);
        }
    }


}