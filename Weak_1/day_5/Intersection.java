package Weak_1.day_5;

import java.util.*;


public class Intersection {
  
   public static void main(String[] args) {
    int[] nums1={1,2,3,4,5};
    int[] nums2={3,2,5,6};
   
    // public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums1)
        {
            set.add(n);
        }
        Set<Integer> ans=new HashSet<>();
        for(int n:nums2)
        {
            if(set.contains(n))
            {
                ans.add(n);
            }
        }

        int[] arr=new int[ans.size()];
        int i=0;
        for(int n: ans)
        {
            arr[i++]=n;
        }
        System.out.println(Arrays.toString(arr));

    }
}


