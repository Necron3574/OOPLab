import java.util.*;
public class Q6{
    public static void main(String args[]){
      System.out.println("Enter four numbers");
      Scanner sc = new Scanner(System.in);
      int num[] = new int[4];
      for(int i =0;i<4;i++)
        num[i] = sc.nextInt();
      System.out.println("With repetition");
      for(int a:num){
        for(int b:num){
          for(int c:num){
            for(int d:num){
              System.out.println(Integer.toString(a) + Integer.toString(b) + Integer.toString(c) + Integer.toString(d));
            }
          }
        }
      }
      System.out.println("Without repetition");
      for(int a:num){
        for(int b:num){
          for(int c:num){
            for(int d:num){
              if(a==b||b==c||c==d||a==c||a==d||b==d)
                ;
              else
                System.out.println(Integer.toString(a) + Integer.toString(b) + Integer.toString(c) + Integer.toString(d));
            }
          }
        }
      }
    }
}
