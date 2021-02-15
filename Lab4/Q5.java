import java.util.*;
class Q5{
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
  int nondiag_sum = 0;
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(i+j==2)
          nondiag_sum += a[i][j];
      }
    }
    int diag_sum = 0;
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
          if(i==j)
            diag_sum += a[i][j];
        }
      }

    if(nondiag_sum!= diag_sum){
      System.out.println("Not a magic square");
      System.exit(0);
    }

    int sum = diag_sum;
    int flag = 1;

    for(int i=0;i<m;i++){
      int rowsum = 0;
        for(int j=0;j<n;j++){
          rowsum += a[i][j];
        }
        if(rowsum != sum)
          flag = 0;
    }

    for(int i=0;i<m;i++){
      int colsum = 0;
        for(int j=0;j<n;j++){
          colsum += a[j][i];
        }
        if(colsum != sum)
          flag = 0;
    }

    if(flag == 0){
      System.out.println("Not a magic square");
    }
    else
      System.out.println("Magic square");
  }
}
