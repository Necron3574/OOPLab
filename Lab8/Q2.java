import java.util.*;
abstract class compute{
  double area;
  abstract double compute_area();
  void show_area(){
    compute_area();
    System.out.println("The area is " + area);
  }
}
class Rectangle extends compute{
  double length,breadth;
  Rectangle(int l, int b){
      length = l;
      breadth = b;
  }
  double compute_area(){
    super.area = length*breadth;
    return super.area;
  }
}
class Circle extends compute{
  double radius;
  Circle(double r){
      radius = r;
  }
  double compute_area(){
    super.area = 3.14*radius*radius;
    return super.area;
  }
}
class Q2{
  public static void main(String args[]){
        compute r = new Rectangle(3,7);
        r.show_area();
        r = new Circle(5);
        r.show_area();
      }
}
