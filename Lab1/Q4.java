import java.util.*;
class Q4{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number:");
      int x = sc.nextInt();
      int n = x;
      int a,y=0;
      while(n>1){
        a = n%10;
        y = y*10 + a;
        n = n/10;
      }
      if(x==y){
        System.out.println("Palindrome");
      }
      else{
        System.out.println("Not a palindrome");
      }
  }
}
