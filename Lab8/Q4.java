import java.util.*;
abstract class compute{
    double area;
    abstract void compute_area();
    void show_area(){
      compute_area();
      System.out.println("The area is " + area);
    }
}
class Triangle extends compute{
  double length,breadth;
  Triangle(double l ,double b){
    length = l;
    breadth = b;
  }
  void compute_area(){
    super.area = length*breadth/2;
  }
}
class Square extends compute{
  double side;
  Square(double s){
    side = s;
  }
  void compute_area(){
    super.area = side*side;
  }
}

class Q4{
  public static void main(String args[]){
        compute c = new Triangle(5,10);
        c.show_area();
        c = new Square(7);
        c.show_area();
    }
}
