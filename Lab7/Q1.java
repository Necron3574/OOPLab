import java.util.*;

class StudentDetail{
  String name;
  int id;
  static String college_name = "MIT";
  StudentDetail(String nm,int ID){
    name = nm;
    id = ID;
  }
  void display_details(){
    System.out.println("The student name is " + name);
    System.out.println("The student ID is " + id);
    System.out.println("The student college is " + college_name);
    System.out.println("------------------------------------------");
  }
}

class Q1{
  public static void main(String args[]){
    StudentDetail s1 = new StudentDetail("Alice",1);
    StudentDetail s2 = new StudentDetail("Bob",2);
    StudentDetail s3 = new StudentDetail("Charlie",3);
    StudentDetail s4 = new StudentDetail("Dave",4);
    StudentDetail s5 = new StudentDetail("Erin",5);
    s1.display_details();
    s2.display_details();
    s3.display_details();
    s4.display_details();
    s5.display_details();
  }
}
