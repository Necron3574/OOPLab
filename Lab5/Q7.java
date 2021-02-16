import java.util.*;
class Result{
  Scanner sc = new Scanner(System.in);
  int marks[][] = new int[3][3];
  int total[] = new int[3];

  void compTotal(){
    for(int i = 0;i<3;i++){
      total[i]=0;
      for(int j=0;j<3;j++){
        total[i] += marks[j][i];
      }
    }
  }
// Enter marks subject wise
  void getMarks() {
    for(int i=0;i<3;i++){
      System.out.println("Enter marks for subject " +Integer.toString(i+1));
      for(int j=0;j<3;j++){
        marks[i][j] = sc.nextInt();
      }
    }
    compTotal();
  }
  void subject_highest(){
    int high[] = new int[3];
    int roll[] = new int[3];
    for(int i=0;i<3;i++){
      high[i] = 0;
      for(int j=0;j<3;j++){
        if(marks[i][j]>high[i]){
          high[i] = marks[i][j];
          roll[i] = j+1;
        }
      }
    }
    for(int i=0;i<3;i++)
      System.out.println("The subject highest in subject "+ Integer.toString(i+1) + " is roll number " + roll[i] + " with " + high[i] + " marks.");
  }
  void total_highest(){
    int high = 0;
    int roll=0;
    for(int i=0;i<3;i++){
      if(total[i]>high){
        high = total[i];
        roll = i+1;
      }
    }
    System.out.println("The total highest scorer in all subjects is roll number " + roll + " with " + high + " marks.");
  }
}
public class Q7{
  public static void main(String args[]){
    Result r = new Result();
    r.getMarks();
    r.subject_highest();
    r.total_highest();
  }
}
