package Multithreading;

public class ThreadExtend {
    public static void main(String[] args) {
        One o= new One();
        Two t= new Two();
        o.start();
        t.start();
    }
}

class One extends Thread{
    public void run(){
        int i=0;
       while(i<=50){
           System.out.println("bruhh");
           i++;
       }
    }

}
class Two extends Thread{
    public void run(){
        int i=0;
        while(i<=50){
            System.out.println("lmao");
            i++;
        }
    }
}