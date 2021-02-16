import java.util.*;
public class Q11{
  public static double square(int x){
    int k = x*x;
    return k;
  }
  public static double square(double x){
    double k = x*x;
    return k;
  }
    public static void main(String args[]){

      System.out.println(square(3));
      System.out.println(square(0.2));
  }
}
