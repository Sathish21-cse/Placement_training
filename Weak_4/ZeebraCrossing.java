package Weak_4;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ZeebraCrossing
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int l=sc.nextInt();
            int jump=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            //  System.out.println(l+" "+jump+" "+s);
            System.out.println(isPossible(jump,s));
        }

    }

    public static int isPossible(int jump,String s)
    {
        char prev=s.charAt(0);
        int t=0;
        int i,last=0;
        for(i=1;i<s.length();i++)
        {
            if(t < jump-1)
            {
                if(prev!=s.charAt(i))
                {

                    prev=s.charAt(i);
                    t++;
                }
            }

        }
        if(t!=jump-1)
        {
            return -1;
        }
        int j;
        for(j=s.length()-1;j>last;j--)
        {
            if(prev!=s.charAt(j))
            {
                return j+1;
            }
        }

        return -1;
    }
}

