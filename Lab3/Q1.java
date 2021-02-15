import java.util.*;
public class Q1{
    public static void main(String args[]){
      System.out.println("Enter number");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = n;
      int b,ans=0;
      while(n>=1){
        b = n%10;
        ans += b*b*b;
        n /= 10;
      }
      if(ans==x)
        System.out.println("Armstrong");
      else
        System.out.println("Not Armstrong");
    }
}
