package Weak_2.day_1;import java.util.*;
public class ContainsOnlyDigits {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String st=s.replaceAll("\\D","");
    if(s.equals(st))
    {
      System.out.println("The String contains only digits");
    }
    else{
      System.out.println("It is not only contains digts");
    }
  }
}
