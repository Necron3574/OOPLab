import java.util.*;
class Q1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String:");
    String str = sc.nextLine();
    int char_num=0,spaces=0,vowels=0,words = 0;
    for(int i =0;i<str.length();i++){
      if(str.charAt(i)==' ')
        spaces+= 1;
      else
        char_num += 1;
      if(str.charAt(i) == 'A'||str.charAt(i) == 'E'||str.charAt(i) == 'I'||str.charAt(i) == 'O'||str.charAt(i) == 'U'||str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u')
        vowels +=1;
    }
    String[] wordlist = str.split(" ");
    for(int i=0;i<wordlist.length;i++){
      if(wordlist[i] != " ")
        words ++;
    }
    System.out.println("The number of characters are " + char_num);
    System.out.println("The number of words are " + words);
    System.out.println("The number of spaces are " + spaces);
    System.out.println("The number of vowels are " + vowels);
  }
}
