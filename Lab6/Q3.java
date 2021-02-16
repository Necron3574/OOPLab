import java.util.*;
import java.io.*;
class Account{
    private String name;
    private double accnum;
    private String type;
    private int balance;
    int min_balance = 2500;
    Account(String n,double a,String t){
        name = n;
        accnum = a;
        type = t;
        balance = 0;
        
    }
    void Deposit(double x){
        System.out.println("Amount Deposited");
        balance += x;
    }
    void DisplayBalance(){
        System.out.println("Your balance is " + balance);
    }
    void Withdraw(int x){
        if(balance-x>min_balance){
            System.out.println("Transaction successful");
            balance -= x;
            System.out.println("Your balance is " + balance);
        }
        else
            System.out.println("Insuffucient funds");
    }
    void ComputeInterest(){
        System.out.println("The interest rate is at 8%");
        System.out.println("Your savings is " + balance);
        System.out.println("The interest accumulated is " + 8*balance/100);       
    }
    void checkMin(){
            System.out.println("Your balance is " + balance);
            System.out.println("The minimum balance is " + min_balance);
            if(balance<min_balance)
               System.out.println("Your balance is below minimum.\nService tax will be applied");
    }
}

class CurrentAccount extends Account{
    CurrentAccount(String n,double a, String t){
        super(n,a,t);
    }
    void ComputeInterest(){
        System.out.println("This feature is only available in a saving bank account");
    }
}
class SavingsAccount extends Account{
    SavingsAccount(String n,double a, String t){
        super(n,a,t);
    }
    void checkMin(){
        System.out.println("This feature is only available in a current bank account");
    }
}

public class Q3 {
    public static void main(String args[]){
        CurrentAccount c = new CurrentAccount("Alice",118282,"Current");
        SavingsAccount s = new SavingsAccount("Bob",192923,"Savings");
        System.out.println("Current Account:");
        c.Deposit(20000);
        c.Withdraw(5000);
        c.Withdraw(120000);
        c.checkMin();
        c.ComputeInterest();
        c.DisplayBalance();
        System.out.println("Savings Account:");
        s.Deposit(20000);
        s.Withdraw(5000);
        s.Withdraw(120000);
        s.checkMin();
        s.ComputeInterest();
        s.DisplayBalance();
    }
}
