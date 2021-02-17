import java.util.*;

class Game{
  void type(){
    System.out.println("Indoor and Outdoor Games.");
  }
}

class Cricket extends Game{
  void type(){
    System.out.println("Cricket is an outdoor game.");
  }
}
class Chess extends Game{
  void type(){
    System.out.println("Chess is an indoor game.");
  }
}

class Q4{
  public static void main(String args[]){
    Game g = new Game();
    g.type();
    g = new Cricket();
    g.type();
    g = new Chess();
    g.type();
  }
}
