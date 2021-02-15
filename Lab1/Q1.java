import java.util.*;
class Q1{
  public static void main(String args[]){
      Scanner sc  = new Scanner(System.in);
      System.out.println("Enter length:");
      int l = sc.nextInt();
      System.out.println("Enter breadth:");
      int b = sc.nextInt();
      int area = l*b;
      int circumference = 2*l + 2*b;
      System.out.println("Area: " + Integer.toString(area));
      System.out.println("Circumference: " + Integer.toString(circumference));
  }
}
