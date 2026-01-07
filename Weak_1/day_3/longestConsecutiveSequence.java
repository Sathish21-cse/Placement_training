package Weak_1.day_3;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 4, 5, 6, 7, 5, 6};
        int j = 1, max = 1, len = 1, start = 0, bestStart = 0;

        while (j < arr.length) {
            if (arr[j] == arr[j - 1] + 1) {  
                len++;
                if (len > max) {
                    max = len;
                    bestStart = start;    
                }
            } else {
                len = 1;
                start = j;                 
            }
            j++;
        }

      
        for (int n = bestStart; n < bestStart + max; n++) {
            System.out.print(arr[n] + " ");
        }
    }
}