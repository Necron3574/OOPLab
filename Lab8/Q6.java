import java.util.*;

interface Sports{
  void getNumberOfGoals();
  void dispTeam();
}
class Hockey implements Sports{
  public void getNumberOfGoals(){
    System.out.println("The number of goals in the hockey match were 12");
  }
  public void dispTeam(){
    System.out.println();
    System.out.println("The hockey team is:");
    System.out.println("Player1");
    System.out.println("Player2");
    System.out.println("Player3");
    System.out.println("Player4");
    System.out.println("Player5");
    System.out.println("Player6");
    System.out.println("Player7");
    System.out.println("Player8");
    System.out.println("Player9");
    System.out.println("Player10");
    System.out.println("Player11");
    System.out.println();
  }
}
class Football implements Sports{
  public void getNumberOfGoals(){
    System.out.println("The number of goals in the football match were 7");
  }
  public void dispTeam(){
    System.out.println();
    System.out.println("The football team is:");
    System.out.println("Player1");
    System.out.println("Player2");
    System.out.println("Player3");
    System.out.println("Player4");
    System.out.println("Player5");
    System.out.println("Player6");
    System.out.println("Player7");
    System.out.println("Player8");
    System.out.println("Player9");
    System.out.println("Player10");
    System.out.println("Player11");
    System.out.println();
  }
}

class Q6{
  public static void main(String args[]){
    Sports s = new Hockey();
    s.getNumberOfGoals();
    s.dispTeam();
    s = new Football();
    s.getNumberOfGoals();
    s.dispTeam();
  }
}
