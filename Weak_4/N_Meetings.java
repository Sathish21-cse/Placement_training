package Weak_4;
import java.util.*;
public class N_Meetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arrlist = {{2, 4}, {10, 11}, {3, 5}, {4, 7}, {6, 8}};
        Arrays.sort(arrlist, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 1;
        int lastEnd = arrlist[0][1];


        for (int i = 1; i < arrlist.length; i++) {
            if (arrlist[i][0] >= lastEnd) {
                count++;
                lastEnd = arrlist[i][1];
            }
        }

            System.out.println(count);


    }
}
