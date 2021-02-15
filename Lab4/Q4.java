import java.util.*;
class Q3{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter dimensions of matrix 1");
  int m1,n1,m2,n2;
  m1 = sc.nextInt();
  n1 = sc.nextInt();
  System.out.println("Enter dimensions of matrix 2");
  m2 = sc.nextInt();
  n2 = sc.nextInt();
  int a[][] = new int[m1][n1];
  int b[][] = new int[m2][n2];
  int c[][] = new int[n1][m2];
  System.out.println("Enter elements of matrix 1");
  for(int i=0;i<m1;i++){
    for(int j=0;j<n1;j++){
        a[i][j] = sc.nextInt();
      }
    }
  System.out.println("Enter elements of matrix 2");
  for(int i=0;i<m2;i++){
    for(int j=0;j<n2;j++){
        b[i][j] = sc.nextInt();
      }
    }
  for(int i=0;i<m1;i++){
    for(int j=0;j<n2;j++){
        c[i][j] = 0;
        for(int k = 0; k < n1;k++)
          c[i][j] += a[i][k]*b[k][j];
      }
    }
    System.out.println("The result is");
    for(int i=0;i<n1;i++){
      for(int j=0;j<m2;j++){
          System.out.print(c[i][j] + " ");
        }
        System.out.println();
      }
  }
}
