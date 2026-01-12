package Weak_1.day_6;

import java.util.*;
public class MaxMinArrangement {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] arr={2,4,6,15,1,7,0,9};
    int[] arr1=new int[arr.length];
    int i=0,j=arr.length-1;
    Arrays.sort(arr);
    int index=0;
    while(i<j)
    {
       arr1[index]=arr[j];
       j--;
       index++;
       arr1[index]=arr[i];
       i++;
       index++;
    }
    System.out.println(Arrays.toString(arr1));
  }
}
