import java.util.*;
interface Toolkit{
  void totalsales();
}
class Hardware implements Toolkit{
  String Category;
  String Manufacturer;
  Hardware(String cat, String man){
    Category = cat;
    Manufacturer = man;
  }
  public void totalsales(){
    System.out.println("A total of 60 units were sold and sales are 5000$");
  }
}
class Software implements Toolkit{
  String Type;
  String OS;
  Software(String type, String os){
    Type = type;
    OS = os;
  }
  public void totalsales(){
    System.out.println("A total of 100 programs were sold and sales are 20000$");
  }
}
class Q1{
  public static void main(String args[]){
        Toolkit t = new Hardware("Mouse","Logitech");
        t.totalsales();
        t = new Software("Antivirus","Norton");
        t.totalsales();
      }
}
