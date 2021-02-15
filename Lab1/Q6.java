import java.util.*;
class Q6{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Number:");
      int x = sc.nextInt();
      for(int i=0;i<11;i++){
          System.out.println(x + " x " + i + " = " + x*i);
      }
    }
}
