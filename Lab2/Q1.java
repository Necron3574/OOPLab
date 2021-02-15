import java.util.*;
class Q1{
  public static void main(String args[]){
    System.out.println("Enter year:");
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    boolean leap;
    if(year%4 != 0){
      leap = false;
    }
    else{
      if(year%100 != 0){
        leap = true;
      }
      else{
        if(year%400 != 0){
          leap = false;
        }
        else{
          leap = true;
        }
      }
    }
    if(leap){
      System.out.println("Its a leap year");
    }
    else{
      System.out.println("Not a leap year");
    }
  }
}
