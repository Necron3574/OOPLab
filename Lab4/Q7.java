import java.util.*;
import java.lang.Math;
public class Q7{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int flag;
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter elements");
    for(int i = 0;i<n;i++)
      a[i] = sc.nextInt();
    int big = 0;
    int small = 999999;
    for(int x:a){
      if(x>big)
        big = x;
      if(x<small)
        small= x;
    }
    System.out.println("The largest number in the array is " + big);
    System.out.println("The smallest number in the array is " + small);
  }
}
