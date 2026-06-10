package June_2026.Week_1.Day_2;

import java.util.Arrays;

public class minimum_coins {
    public static void main(String[] args) {
        int n=6;
        int[] coin={1,3,4};
        int[] ans=new int[n+1];
        int count=0;

        for(int i=0;i<coin.length;i++)
        {
            for (int j = coin[i]; j <= n; j++)
            {

                    int tot = 1 + ans[j - coin[i]];
                    if (ans[j] != 0)

                        ans[j] = Math.min(ans[j], tot);
                    else
                        ans[j] = tot;

            }
        }

//        for(int i=0;i<coin.length;i++)
//        {
//            int rem=n-coin[i];
//            for(int j=0;j<coin.length;j++)
//            {
//                int r=rem%coin[j];
//
//            }
//        }

        System.out.println(Arrays.toString(ans));
    }
}
