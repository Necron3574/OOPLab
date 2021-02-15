import java.util.*;
class Q3{
  public static void main(String args[]){
    System.out.println("Enter number:");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    System.out.println("Multiplied by 2: " + (int)(x<<1));
    System.out.println("Divided by 2   : " + (int)(x>>1));
  }
}
