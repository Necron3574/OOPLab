import java.util.*;

class ObjCreater{
  static int count = 0;
  ObjCreater(){
    count ++;
  }
  void show_count(){
    System.out.println("The count is " + count);
  }
}

class Q2{
  public static void main(String args[]){
    ObjCreater o1 = new ObjCreater();
    o1.show_count();
    ObjCreater o2 = new ObjCreater();
    o2.show_count();
    ObjCreater o3 = new ObjCreater();
    o3.show_count();
    ObjCreater o4 = new ObjCreater();
    o4.show_count();
    o1.show_count();
  }
}
