import java.util.*;
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
  int x,count = 0;
  System.out.println("Enter element to be searched in the matrix");
  x = sc.nextInt();
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(a[i][j] == x)
          count ++;
      }
    }
  System.out.println("The number of occurences are " + count);
  }
}
