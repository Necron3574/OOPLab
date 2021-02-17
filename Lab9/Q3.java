import java.util.*;
class Q3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str;
    String rev_str;
    char arr[];
    int flag;
    int choice;
    while(true){
      System.out.println("Enter your String (Type EXIT to break)");
      str = sc.nextLine();
      rev_str = ((new StringBuffer(str)).reverse()).toString();
      if(str.equalsIgnoreCase("EXIT"))
        break;
      System.out.println("1.Check Palindrome\n2.Write in Alphabetical order\n3.Reverse String\n4.Concat original string to the reversed string");
      choice = sc.nextInt();
      sc.nextLine();
      switch(choice){
          case 1:
            flag = 0;
            for(int i=0;i<str.length()/2;i++){
              if(str.charAt(i)!=str.charAt(str.length() - i-1))
                flag = 1;
            }
            if(flag==1)
              System.out.println("Not a Palindrome");
            else
              System.out.println("It is a Palindrome");
            break;
          case 2:
            arr = str.toCharArray();
            Arrays.sort(arr);
            str = new String(arr);
            System.out.println(str);
            break;
          case 3:
            System.out.println(rev_str);
            break;
          case 4:
            System.out.println(str.concat(rev_str));
            break;
      }
    }
  }
}
