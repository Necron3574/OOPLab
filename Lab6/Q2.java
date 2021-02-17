import java.util.*;
class Student{
  int reg_num;
  String name;
  int age;
  Student(int reg,String nm,int ag){
    reg_num = reg;
    name = nm;
    age = ag;
  }
}
class UG extends Student{
  int sem;
  int fees;
  UG(int reg,String name,int age,int semester,int fee){
    super(reg,name,age);
    sem = semester;
    fees = fee;
  }
  void showDeets(){
    System.out.println("The student name is " + super.name);
    System.out.println("The student registration number is " + super.reg_num);
    System.out.println("The student age is " + super.age);
    System.out.println("The student semester is " + sem);
    System.out.println("The student fees is " + fees);
  }
}
class PG extends Student{
  int sem;
  int fees;
  PG(int reg,String name,int age,int semester,int fee){
    super(reg,name,age);
    sem = semester;
    fees = fee;
  }
  void showDeets(){
    System.out.println("The student name is " + super.name);
    System.out.println("The student registration number is " + super.reg_num);
    System.out.println("The student age is " + super.age);
    System.out.println("The student semester is " + sem);
    System.out.println("The student fees is " + fees);
  }
}
class Q2{
  public static void main(String args[]){
    UG student1 = new UG(190953039,"Alice",19,3,400000);
    PG student2 = new PG(150953849,"Bob",23,2,300000);
    student1.showDeets();
    student2.showDeets();
  }
}
