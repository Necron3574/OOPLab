import java.util.*;
import java.io.*;
class Bank{
    private String name;
    private double acc_num;
    int balance;
    Bank(String n,double a){
        name = n;
        acc_num = a;
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
        if(balance-x>0){
            System.out.println("Transaction successful");
            balance -= x;
            System.out.println("Your balance is " + balance);
        }
        else
            System.out.println("Insuffucient funds");
    }
    void ComputeInterest(){
        System.out.println("The default interest rate is at 5%");
        System.out.println("Your savings is " + balance);
        System.out.println("The interest accumulated is " + 5*balance/100);       
    }
    
}
class SBI extends Bank{
    SBI(String n,double a){
        super(n,a);
    }
    void ComputeInterest(){
        System.out.println("The interest rate at SBI bank is set as 8% per year");
        System.out.println("Your savings is " + balance);
        System.out.println("The interest accumulated per year is " + 8*balance/100);
    }
}
class ICICI extends Bank{
    ICICI(String n,double a){
        super(n,a);
    }
    void ComputeInterest(){
        System.out.println("The interest rate at ICICI bank is set as 7% per year");
        System.out.println("Your savings is " + balance);
        System.out.println("The interest accumulated per year is " + 7*balance/100);
    }
}
class AXIS extends Bank{
    AXIS(String n,double a){
        super(n,a);
    }
    void ComputeInterest(){
        System.out.println("The interest rate at AXIS bank is set as 9% per year");
        System.out.println("Your savings is " + balance);
        System.out.println("The interest accumulated per year is " + 9*balance/100);
    }
}
public class Q6 {
    public static void main(String args[]){
        SBI a = new SBI("Alice",1929);
        ICICI b = new ICICI("Bob",2202);
        AXIS c = new AXIS("Charlie",3212);
        a.Deposit(20000);
        b.Deposit(30000);
        c.Deposit(40000);
        a.ComputeInterest();
        b.ComputeInterest();
        c.ComputeInterest();
    }
}
