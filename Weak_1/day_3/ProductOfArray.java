package Weak_1.day_3;
import java.util.Scanner;

public class ProductOfArray {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int child=sc.nextInt();
    int choc=sc.nextInt();
    int dev=choc/child;
    int rem=choc%child;
    int[] arr=new int[child];
    for(int i=0;i<rem;i++)
    {
     arr[i]+=1;
    }
    for(int k:arr)
    {
      System.out.println(k+dev);
    }
   } 
}
