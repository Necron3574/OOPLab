import java.util.*;
class Complex{
  double real;
  double img;
  Complex(double a,double b){
    real = a;
    img = b;
  }
  void display(){
    System.out.println(real + " + " + img + "i");
  }
  void add(Complex c){
      real = real + c.real;
      img = img + c.img;
  }
  void add(int x){
    real = real +x;
  }
}
public class Q4{
  public static void main(String args[]){
      Complex c1 = new Complex(3,4);
      c1.display();
      Complex c2 = new Complex(4,8);
      c2.display();
      c1.add(c2);
      c1.display();
      int k = 12;
      c1.add(k);
      c1.display();
  }
}
