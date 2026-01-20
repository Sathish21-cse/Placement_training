package Weak_3.day_2;

public class BinarySearch1 {
  public static void main(String[] args) {
    int[] arr={1,1,2,2,2,3,3,3,3,4,4,4,5};
    int end=arr.length,start=0,target=3;
    int first=-1,last=-1;
    BinarySearchfirst(start,end,arr,target,first,last);
     BinarySearchlast(start,end,arr,target,first,last);
    
  }
   public static void BinarySearchfirst(int start,int end,int[] arr,int target,int first,int last)
    {
          if(start<=end){
                
                  int mid=(start+end)/2;
                  if(arr[mid]==target)
                  {
                    first=mid;
                    BinarySearchfirst(start,mid-1,arr,target,first,last);
                  
                  }
                  else if(arr[mid]>target)
                  {
                    BinarySearchfirst(start, mid-1, arr, target, first, last);
                  }
                  else
                  {
                    BinarySearchfirst(mid+1, end, arr, target, first, last);
                  }
                
              }
              else{
                System.out.println("First Occurence is :"+first+ " target "+target);
              }
      }

       public static void BinarySearchlast(int start,int end,int[] arr,int target,int first,int last)
    {
          if(start<=end){
                
                  int mid=(start+end)/2;
                  if(arr[mid]==target)
                  {
                    
                    last=mid;
                    BinarySearchlast(mid+1, end, arr, target, first, last);
                  }
                  else if(arr[mid]>target)
                  {
                    BinarySearchlast(start, mid-1, arr, target, first, last);
                  }
                  else
                  {
                    BinarySearchlast(mid+1, end, arr, target, first, last);
                  }
                
              }
              else{
                System.out.println("Last Occurence :"+last+ " target "+target);
              }
      }
    
}
