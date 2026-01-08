package Weak_1.day_3;

public class prouduct {
  public static void main(String[] args) {
    int[] arr={1,2,3,4};
    int[] left=new int[arr.length];
    int[] right=new int[arr.length];
    left[0]=1;
    right[arr.length-1]=1;
    int i=1,j=arr.length-2;
    while(i<arr.length)
    {
       left[i]=arr[i-1]*left[i-1];
       right[j]=arr[j+1]*right[j+1];
       i++;j--;
    }
    for(int k=0;k<arr.length;k++)
    {
      // System.out.println(arr[k]+" "+left[k]+" "+right[k]+" "+left[k]*right[k]);
      System.out.println(left[k]*right[k]);
    }
  }
}
