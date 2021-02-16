import java.util.*;
class NumberFun{
  Scanner sc = new Scanner(System.in);
  int a[] = new int[10];
  void getData(){
    System.out.println("Enter 10 values for the array:");
    for(int i=0;i<10;i++)
      a[i] = sc.nextInt();
  }
  void getData(int x[]){
    for(int i=0;i<10;i++)
      a[i] = x[i];
  }
  void display(){
    System.out.println("Your array is:");
    for(int i=0;i<10;i++)
      System.out.print(a[i] + " ");
    System.out.println();
  }
  void displayLargest(){
    int big = 0;
    for(int i=0;i<10;i++){
      if(a[i]>big)
        big = a[i];
    }
    System.out.println("The largest number is " + big);
  }
  void displayAverage(){
    double sum = 0;
    for(int i=0;i<10;i++){
      sum += a[i];
    }
    System.out.println("The average is " + sum/10);
  }
  void sort(){
    int temp;
    for(int i=0;i<10;i++){
      for(int j = 1; j< 10-i;j++){
        if(a[j-1]>a[j]){
          temp = a[j-1];
          a[j-1] = a[j];
          a[j] = temp;
        }
      }
    }
    System.out.println("The array has been sorted.");
  }
}


public class Q8{
  public static void main(String args[]){
    NumberFun n = new NumberFun();
    int x[] = {2,43,56,34,45,52,81,76,67,63};
    n.getData(x);
    n.display();
    n.displayLargest();
    n.displayAverage();
    n.sort();
    n.display();
  }
}
