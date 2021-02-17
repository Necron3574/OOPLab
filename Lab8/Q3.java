import java.util.*;
interface compute{
  double compute_area();
}
class Rectangle implements compute{
  double length,breadth;
  Rectangle(int l, int b){
      length = l;
      breadth = b;
  }
  public double compute_area(){
    return length*breadth;
  }
}
class Circle implements compute{
  double radius;
  Circle(double r){
      radius = r;
  }
  public double compute_area(){
    return 3.14*radius*radius;
  }
}
class Q3{
  public static void main(String args[]){
        compute r = new Rectangle(3,7);
        System.out.println(r.compute_area());
        r = new Circle(5);
        System.out.println(r.compute_area());
      }
}
