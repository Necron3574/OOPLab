import java.util.*;
class Swap{
    private int a,b;
    Swap(int x,int y){
      a = x;
      b = y;
    }
    void swap(){
        int temp;
        temp = this.a;
        this.a = this.b;
        this.b = temp;
    }
    void printNums(){
      System.out.println(a + " " +b);
    }
}
class Q9{
  public static void main(String args[]){
      int x = 5,y=10;
      System.out.println(x + " " +y);
      System.out.println("Swap using call by value");
      int k  = 0;
      k = x;
      x = y;
      y = k;
      System.out.println(x + " " +y);
      System.out.println();
      Swap s = new Swap(5,10);
      s.printNums();
      System.out.println("Swap using call by reference");
      s.swap();
      s.printNums();
  }
}
