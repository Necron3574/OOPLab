import java.util.*;
import java.lang.Math;
public class Q9{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array 1 and array 2");
    int flag;
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int a[] = new int[n1];
    int b[] = new int[n2];
    int c[] = new int[n1+n2];
    System.out.println("Enter elements of array 1");
    for(int i = 0;i<n1;i++)
      a[i] = sc.nextInt();
    System.out.println("Enter elements of array 2");
    for(int i = 0;i<n2;i++)
      b[i] = sc.nextInt();
    for(int i = 0;i<n1;i++)
      c[i] = a[i];
    for(int i = 0;i<n2;i++)
      c[n1+i] = b[i];
    int temp = 0;
    for(int i=0; i < n1+n2; i++){
        for(int j=1; j < (n1+n2-i); j++){
              if(c[j-1] > c[j]){

                 temp = c[j-1];
                 c[j-1] = c[j];
                 c[j] = temp;
              }
            }
          }
    for(int i=0;i<n1+n2;i++)
      System.out.print(c[i] + " ");
  }
}
