package ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {
    String name;
    int age;
    double salary;

    public ComparatorExample(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public static void main(String[] args) {
        ArrayList<ComparatorExample> list= new ArrayList<>();
        list.add(new ComparatorExample("rahul",26,30000.00));
        list.add(new ComparatorExample("rohit",22,1200.00));
        list.add(new ComparatorExample("naruto",45,89000.00));
//        Collections.sort(list);
        list.sort(Comparator.comparingDouble(ComparatorExample::getSalary));
//        Comparator<ComparatorExample> comparatorExampleComparator = Comparator.comparingDouble(ComparatorExample::getSalary);
//        list.sort();
//        Collections.sort(list, Comparator.comparing(list::));
        for (ComparatorExample c: list){
            System.out.println(c.age +" " +c.salary +" "+c.name);
        }
    }

}
class Student{
    String name;
    int age;
    double salary;

    public Student(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }
}
