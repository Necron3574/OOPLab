import java.util.*;
public class Q4{
    public static int gcd(int x, int y){
      if(y!=0)
        return gcd(y,x%y);
      else
        return x;
    }

    public static void main(String args[]){
      System.out.println("Enter m and n");
      Scanner sc = new Scanner(System.in);
      int flag;
      int m = sc.nextInt();
      int n = sc.nextInt();
      for(int i=m;i<=n;i++){
        flag = 0;
        for(int j=2;j<i;j++){
          if(gcd(i,j)!=1)
            flag = 1;
        }
      if(flag==0)
        System.out.print(i + ",");
      }
    }
}
