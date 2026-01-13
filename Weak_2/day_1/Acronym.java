package Weak_2.day_1;
import java.util.*;
public class Acronym {
  public static void main(String[] args) {
    
  
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  String[] word=s.split(" ");
  StringBuilder out=new StringBuilder();
  for(String n:word)
  {
    out.append(Character.toUpperCase(n.charAt(0)));
  }
 System.out.println(out.toString());
}

}
