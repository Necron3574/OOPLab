import java.util.*;
interface compute{
    abstract double compute_area();
}

class Triangle implements compute{
  double length,breadth;
  Triangle(double l ,double b){
    length = l;
    breadth = b;
  }
  public double compute_area(){
    return length*breadth/2;
  }
}
class Square implements compute{
  double side;
  Square(double s){
    side = s;
  }
  public double compute_area(){
    return side*side;
  }
}

class Q5{
  public static void main(String args[]){
        compute c = new Triangle(5,10);
        System.out.println("The area is " + c.compute_area());
        c = new Square(7);
        System.out.println("The area is " + c.compute_area());
    }
}
