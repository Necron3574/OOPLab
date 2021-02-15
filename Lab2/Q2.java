import java.util.*;
class Q2{
  public static void main(String args[]){
    System.out.println("Enter int,double,Char:");
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    double d = sc.nextDouble();
    char c = sc.next().charAt(0);
    System.out.println("Int to byte " + (byte) i);
    System.out.println("Char to int " + (int)c);
    System.out.println("Double to byte " + (byte) d);
    System.out.println("Double to int " + (int) d);
  }
}
