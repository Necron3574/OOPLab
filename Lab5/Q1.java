import java.util.*;
class Box{
  private int width,breadth,height;
  Box(int wid,int bre,int hei){
    width= wid;
    breadth = bre;
    height = hei;
  }
  int getVol(){
    return width*breadth*height;
  }
}
public class Q1{
  public static void main(String args[]){
    Box b = new Box(3,4,5);
    System.out.println(b.getVol());
  }
}
