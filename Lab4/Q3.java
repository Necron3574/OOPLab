import java.util.*;
class Q3{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter dimensions of matrix.");
  int m,n;
  int flag = 0;
  m = sc.nextInt();
  n = sc.nextInt();
  int a[][] = new int[m][n];
  System.out.println("Enter elements");
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        a[i][j] = sc.nextInt();
      }
    }
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
          if(a[i][j]!=a[j][i])
            flag = 1;
        }
      }
    if(flag==0)
      System.out.println("Symmetric Matrix");
    else
      System.out.println("Not a Symmetric Matrix");
    }
}
