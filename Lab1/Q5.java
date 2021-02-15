import java.util.*;
class Q3{

  public static int fact(int n){
    if(n==0)
      return 1;
    return n*fact(n-1);
  }

  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Number:");
      int x = sc.nextInt();
      System.out.println(fact(x));
  }
}
