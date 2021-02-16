import java.util.*;
import java.lang.Math;
class Q6{
  public static int gcd(int x,int y){
    if (y != 0)
              return gcd(y, x % y);
          else
              return x;
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int flag;
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter elements");
    for(int i = 0;i<n;i++)
      a[i] = sc.nextInt();
    System.out.println("The prime numbers are:");
    for(int x:a){
      flag = 0;
      for(int i=2;i<x;i++){
        if(gcd(i,x)!=1)
          flag = 1;
      }
      if(flag==0)
        System.out.println(x);
    }
  }
}
