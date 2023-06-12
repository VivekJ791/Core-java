package oops;

import java.net.SocketOption;
import java.util.AbstractCollection;

class Account{
    int accno;
    String name;
    double amount;
    void insert(int a,String s,double am){
        accno=a;
        name = s;
        amount=am;

    }
    void deposit(double dep_amount){
        amount= amount+dep_amount;
        System.out.println("Deposited amount : "+dep_amount+"total balance:"+amount);
    }
    void withdraw(double wd_amount){
        if(amount<wd_amount){
            System.out.println("Not enough balance ");
        }else{
            amount=amount-wd_amount;
            System.out.println("Withdrawn amount:"+wd_amount+"total balance :"+amount);
        }

    }
    void display(){
        System.out.println("account number: "+accno+" name: "+name+" amount: "+amount);
    }
    void checkBalance(){
        System.out.println("Total balance:"+amount);
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.insert(2042,"rahul",80000);
        a1.display();
        a1.deposit(20000);
        a1.display();
        a1.withdraw(120000);
        a1.display();
    }
}
