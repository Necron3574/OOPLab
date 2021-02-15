import java.util.*;
class Q2{
  public static void main(String args[]){
      Scanner sc  = new Scanner(System.in);
      System.out.println("Enter 10 numbers");
      int neg=  0;
      int pos= 0;
      int zero = 0;
      int x = 0;
      for(int i=0;i<10;i++){
        x = sc.nextInt();
        if(x>0){
          pos+=1;
        }
        else if(x<0){
          neg += 1;
        }
        else{
          zero += 1;
        }
      }
      System.out.println("The number of positive integers are:" + pos);
      System.out.println("The number of negative integers are:" + neg);
      System.out.println("The number of 0's are:" + zero);
  }
}
