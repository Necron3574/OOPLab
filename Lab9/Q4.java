import java.util.*;
import java.io.*;
class Q4{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str1;
    String str2;
    StringBuffer strb;
    int choice,x;
    char toggled[] = new char[20];
    while(true){
      System.out.println("Enter your String (Type EXIT to break)");
      str1 = sc.nextLine();
      strb = new StringBuffer(str1);
      if(str1.equalsIgnoreCase("EXIT"))
        break;
      System.out.println("1.Compare with other string\n2.Toggle Case\n3.Check if other string is a substring\n4.replace with hello");
      choice = sc.nextInt();
      sc.nextLine();
      switch(choice){
          case 1:
            System.out.println("Enter string to compare:");
            str2 = sc.nextLine();
            x = str1.compareTo(str2);
            if(x==0)
              System.out.println("The strings are equal");
            else if(x>0){
              System.out.println(str1 + " is lexicographically greater than " + str2);
            }
            else{
              System.out.println(str2 + " is lexicographically greater than " + str1);
            }
            break;
          case 2:
            for(int i=0;i<str1.length();i++){
              if(Character.isUpperCase(str1.charAt(i)))
                toggled[i] = (Character.toLowerCase(str1.charAt(i)));
              if(Character.isLowerCase(str1.charAt(i)))
                toggled[i] = (Character.toUpperCase(str1.charAt(i)));
            }
            System.out.println(toggled);
            break;
          case 3:
            System.out.println("Enter string to compare:");
            str2 = sc.nextLine();
            if(str1.contains(str2))
              System.out.println("It is a substring");
            else
              System.out.println("It is not a substring");
            break;
          case 4:
            System.out.println("Enter string to compare:");
            str2 = sc.nextLine();
            for(int i=0;i<str1.length();i++){
            if((strb.substring(i,i+str2.length()).toString()).equals(str2)){
              strb.replace(i,i+str2.length(),"hello");
              System.out.println(strb);
              break;
            }
          }
      }
    }
  }
}
