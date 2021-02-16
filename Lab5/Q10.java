import java.util.*;
class Stack{
  private int max,top;
  private int a[] = new int[20];
  Stack(int m){
    top = -1;
    max = m;
  }
  boolean isFull(){
    if(top==max-1)
      return true;
    return false;
  }
  boolean isEmpty(){
    if(top==-1)
      return true;
    return false;
  }
  void push(int x){
    if(!isFull())
      a[++top] = x;
    else
      System.out.println("Stack is Full");
  }
  int pop(){
    if(!isEmpty())
      return a[top--];
    else
      System.out.println("Stack is empty");
    return -1;
  }
  void display(){
    System.out.println("The stack is:");
    for(int i=0;i<=top;i++)
      System.out.println(a[i] + " ");
    System.out.println();
  }
}
public class Q10{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      // int x = sc.nextInt()
      Stack s = new Stack(10);
      s.push(1);
      s.push(2);
      s.push(3);
      s.push(4);
      s.display();
      System.out.println(s.pop());
      s.display();
      s.push(4);
      s.push(4);
      s.push(4);
      s.push(4);
      s.push(4);
      s.push(4);
      s.push(4);
      s.push(4);
      s.push(4);
      s.push(4);
      s.display();
  }
}
