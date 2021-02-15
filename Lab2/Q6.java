import java.util.*;
class Q6{
  public static void main(String args[]){
    System.out.println("Enter numbers:");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println((a << 2) + (b >> 2) );
    System.out.println((b > 0));
    System.out.println((a + b * 100) / 10 );
    System.out.println(a&b);
  }
}
