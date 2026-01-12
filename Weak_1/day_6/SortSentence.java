package Weak_1.day_6;
import java.util.*;
public class SortSentence {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String[] starr=s.split(" ");
    String[] out=new String[starr.length];
    for(String w:starr)
    {
      int pos=-1;
      StringBuilder sb=new StringBuilder();
      for(char c:w.toCharArray())
      {
          if(Character.isDigit(c))
          {
            pos=c-'0';
          }
          else{
            sb.append(c);
          }
      }
      out[pos]=sb.toString();
    }
    System.out.println(Arrays.toString(out));

  }
}
