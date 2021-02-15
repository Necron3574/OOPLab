import java.util.*;
public class Q2{
    public static void main(String args[]){
      System.out.println("Enter length and breadth.");
      Scanner sc = new Scanner(System.in);
      int l = sc.nextInt();
      int b = sc.nextInt();
      System.out.println("Area " + l*b);
      System.out.println("Circumference " + 2*(l+b));
    }
}
