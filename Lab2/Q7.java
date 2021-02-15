import java.util.*;
class Q7{
  public static void main(String args[]){
    System.out.println("Enter numbers:");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int big,small;
    big = a>b?(a>c?a:c):(b>c?b:c);
    System.out.println("The largest number is " + big);
    small = a<b?(a<c?a:c):(b<c?b:c);
    System.out.println("The smallest number is " + small);
  }
}
