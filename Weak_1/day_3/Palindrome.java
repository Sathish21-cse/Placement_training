package Weak_1.day_3;
import java.util.*;
public class Palindrome {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    if (isPalindrome(s)) {
            System.out.println(s+ " is a palindrome");
        } else {
            System.out.println(s+ " is not a palindrome");
        }

  }

  public static boolean isPalindrome(String s)
  {
    int i=0,j=s.length()-1;
    while(i<=j)
    {
      if(s.charAt(i)!=s.charAt(j))
      {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
