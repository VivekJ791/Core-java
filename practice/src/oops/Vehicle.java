package oops;

public class Vehicle {
    String name;
    double distanceCovered;
    int yearOfManufacture;
    double price;
    Vehicle(String n,double d,int i,double p){
        this.name=n;
        this.distanceCovered=d;
        this.yearOfManufacture=i;
        this.price=p;
    }
    void display(){
        System.out.println("Name:"+name+"\n"+" Distance covered:"+distanceCovered+"\n"+ " Year of Manufacture: "+yearOfManufacture+"\n"+" Price:"+price);
    }
    public static void main(String[] args) {
        Vehicle v1=new Vehicle("BMW",2045,2016,400000);
        v1.display();
    }
}
