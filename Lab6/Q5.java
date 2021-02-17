import java.util.*;

class Bike{
  void speedlim(){
    System.out.println("Bikes generally have a speed limit of 160 on average.");
  }
}

class Splendor extends Bike{
  void speedlim(){
    System.out.println("Splendor has a speed limit of 180.");
  }
}
class Q5{
  public static void main(String args[]){
    Bike b = new Bike();
    b.speedlim();
    b = new Splendor();
    b.speedlim();
  }
}
