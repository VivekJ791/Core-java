package Encapsulation;

import java.util.Scanner;

class Record{
    private String name=new String("brah");
    String getName(){
        return name;
    }
    void setName(String str){
        this.name=str;
    }
}
public class Eg1 {
    public static void main(String[] args) {
        Record r= new Record();
        System.out.println(r.getName());
        r.setName("rahul");
        System.out.println(r.getName());
    }
}
