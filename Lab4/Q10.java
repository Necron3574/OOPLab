import java.util.*;
import java.lang.Math;
class Q8{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter dimensions of the matrix");
  int m,n;
  m = sc.nextInt();
  n = sc.nextInt();
  int a[][] = new int[m][n];
  System.out.println("Enter elements of the matrix");
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        a[i][j] = sc.nextInt();
      }
    }
  int trace = 0;
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(i==j)
          trace += a[i][j];
      }
    }
  double norm=0;
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        norm += a[i][j]*a[i][j];
      }
    }
  norm = Math.pow(norm,0.5);
  System.out.println("Trace = " + trace);
  System.out.println("Norm = " + norm);
  }
}
