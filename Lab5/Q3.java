
  class Time{
    private int hour,min,sec;
    int carry;
    public Time(){
      hour = 0;
      min = 0;
      sec = 0;
    }
    public Time(int hr,int mi, int se){
      hour = hr;
      min = mi;
      sec = se;
    }
    public String displayTime(){
      return Integer.toString(hour) + ":" + Integer.toString(min) +":"+ Integer.toString(sec);
    }
    public Time addTime(Time y){
      Time z = new Time();
      z.sec = sec + y.sec;
      carry = z.sec/60;
      z.sec = z.sec%60;
      z.min = min + y.min + carry;
      carry = z.min/60;
      z.min = z.min%60;
      z.hour = hour + y.hour + carry;
      z.hour = z.hour%24;
      return z;
  }
}
public class Q3{
  public static void main(String args[]){
      Time x;
      Time y = new Time(8,44,32);
      Time z = new Time(9,24,38);
      System.out.println(y.displayTime());
      x = y.addTime(z);
      System.out.println(z.displayTime());
      System.out.println(x.displayTime());
      }
}
