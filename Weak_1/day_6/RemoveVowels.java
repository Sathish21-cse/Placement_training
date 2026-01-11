package Weak_1.day_6;
import java.util.*;
public class RemoveVowels {
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  s=s.replaceAll("[AEIOUaeiou]","");
  System.out.println(s);
 }


}
