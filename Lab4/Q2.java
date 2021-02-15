import java.util.*;
class Q2{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter dimensions of matrix.");
  int m,n;
  m = sc.nextInt();
  n = sc.nextInt();
  int a[][] = new int[m][n];

  System.out.println("Enter elements");
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        a[i][j] = sc.nextInt();
      }
    }
  int sum = 0;
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(i==j)
          sum += a[i][j];
      }
    }
  System.out.println("The sum is " + sum);
  }
}
