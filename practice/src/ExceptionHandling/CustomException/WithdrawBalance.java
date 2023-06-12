package ExceptionHandling.CustomException;

import javax.swing.*;

class WithdrawAmount extends Exception{
    String str;
    WithdrawAmount(String str){
//        super(str);
        this.str=str;
    }
    public String toString(){
        return str;
    }
}
public class WithdrawBalance {
    double Amount;
    WithdrawBalance(double amt){
        this.Amount= amt;
    }
    void Withdraw(double wd) throws WithdrawAmount{
        if(Amount-wd<0){
            throw new WithdrawAmount("not sufficient balance");
        }
    }
    public static void main(String[] args) {
        WithdrawBalance wd= new WithdrawBalance(2000);
    try{ wd.Withdraw(10000);
    }catch(WithdrawAmount wde){
        System.out.println(wde);
    }
    }
}
