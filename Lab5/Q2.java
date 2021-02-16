import java.util.*;
class Employee{
  private String name;
  private String city;
  private int base_sal;
  private double da_percent;
  private double house_rent_percent;
  void getData(String emp_name,String City,int sal,double DA,double HRA){
    name = emp_name;
    city = City;
    base_sal = sal;
    da_percent = DA;
    house_rent_percent = HRA;
  }
  void display(){
    System.out.println("The Employee's name is " + name);
    System.out.println("The Employee's basic salary is " + base_sal);
    System.out.println("The Employee's total salary is " + calculate());
  }
  double calculate(){
    return base_sal+base_sal*da_percent/100 + base_sal*house_rent_percent/100;
  }
}
public class Q2{
  public static void main(String args[]){
      Employee e = new Employee();
      e.getData("Alice","Chicago",80000,9,20);
      e.display();
      }
}
