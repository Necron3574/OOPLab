import java.util.*;
class Q5{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num1,num2;
    int choice=-3;
    System.out.println("Enter number 1:");
    num1 = sc.nextInt();
    System.out.println("Enter number 2:");
    num2 = sc.nextInt();
    System.out.println("Enter\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Exit");
    choice = sc.nextInt();
    while(choice != 5){
      switch(choice){
        case 1:
          System.out.println("Result: " + num1+num2);
          break;
        case 2:
          System.out.println("Result: " + Integer.toString(num1-num2));
          break;
        case 3:
          System.out.println("Result: " + num1*num2);
          break;
        case 4:
          System.out.println("Result: " + num1/num2);
          break;
        case 5:
          System.out.println("Exiting");
      }
    System.out.println("Enter number 1:");
    num1 = sc.nextInt();
    System.out.println("Enter number 2:");
    num2 = sc.nextInt();
    System.out.println("Enter 1.Add\n2.Subtract\n3.3.Multiply\n4.Divide\n5.Exit");
    choice = sc.nextInt();
    }
  }
}
