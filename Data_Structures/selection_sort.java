package Data_Structures;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr={45,41,69,15,2,3,41,58,72,96,12};

        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            int t=arr[i];
            arr[i]=arr[min];
            arr[min]=t;

        }
        System.out.println(Arrays.toString(arr));

    }
}
