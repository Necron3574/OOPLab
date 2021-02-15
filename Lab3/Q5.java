import java.util.*;
public class Q5{
    public static void main(String args[]){
      System.out.println("Enter number to find");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[]= {1,2,3,1,2,1,5,6,7};
      int count = 0;
      for(int num:a){
          if(num==n)
            System.out.println("Found at " + count);
          count ++;
        }
      }
    }
