package Multithreading;

public class RunnableInterfaceExample {
    public static void main(String[] args) {
        RunnableOne r1= new RunnableOne();
        RunnableTwo r2= new RunnableTwo();
        Thread t1= new Thread(r1);
        Thread t2= new Thread(r2);
        t1.start();
        t2.start();

    }
}
class RunnableOne implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<=30;i++){
            System.out.println("thread one");
        }
    }
}
class RunnableTwo implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<=30;i++){
            System.out.println("thread two");
        }
    }
}