import java.util.*;
import java.io.*;

  class Book{
      String Title;
      String Author;
      int Edition;
      public Book(String title,String author,int edition){
        Title = title;
        Author = author;
        Edition = edition;
      }
      public String getTitle(){
        return Title;
      }
      public String getAuthor(){
        return Author;
      }
      public int getEdition(){
        return Edition;
      }
}
public class Q5{
  public static void main(String[] args){
      Book booklist[] = new Book[6];
      booklist[0] = new Book("Fantasy tales 1","Harry",1);
      booklist[1] = new Book("Mythbusters","John",4);
      booklist[2] = new Book("Fantasy tales 2","Harry",2);
      booklist[3] = new Book("Fantasy tales 1","Harry",2);
      booklist[4] = new Book("Weird places","Melinda",1);
      booklist[5] = new Book("Celestial beings","Harry",6);
      try{
      File myobj = new File("Bookrecords.txt");
      myobj.createNewFile();
      FileWriter writer = new FileWriter("Bookrecords.txt");
      for(int i=0;i<6;i++){
        writer.write("Title: "+booklist[i].getTitle()+",");
        writer.write("Author: "+booklist[i].getAuthor()+",");
        writer.write("Edition: "+Integer.toString(booklist[i].getEdition())+"\n");
        }
      writer.close();
      }
      catch(IOException e){
          System.out.println(e);
      }

      try{
      File myobj = new File("Bookrecords.txt");
      Scanner reader = new Scanner(myobj);
      while(reader.hasNextLine()){
        String x = reader.nextLine();
        int flag = 0;
        for(String temp:x.split(",")){
          if(temp.equals("Author: Harry")){
            flag = 1;
            break;
          }
        }
        if(flag==1)
          System.out.println(x);
      }
  }
  catch(FileNotFoundException e){
    System.out.println(e);
    }
  }
}
