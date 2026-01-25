package Weak_3.day_5;
import java.util.*;
public class execption1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int a=10;
            int b=0;
//            for()
//            checknumber(int n);
            System.out.println(a/b);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can't Divied thes numbers");
        }
        catch(Exception e)
        {
            System.out.println(printStrack);
        }
        // What ever the try of catch run or not run but compulsory the finally block will be run
        finally {
            System.out.println("Thank you!");
        }

//        for(int i=0;i<5;i++)
//        {
//            int n=sc.nextInt();
//            try{
//                chck
//            }
//        }
    }

}
