package June_2026.Week_1.Day_2;

public class Common_Longest_Subsequesnce {

    public static void main(String[] args) {
        String s1="abbcd";
        String s2="aec";
        int[][] dp=new int[s2.length()+1][s1.length()+1];

        for(int i=1;i<=s2.length();i++)
        {
            for(int j=1;j<=s1.length();j++)
            {
                if(s2.charAt(i-1)==s1.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }

        for(int i=0;i<=s2.length();i++)
        {
            for(int j=0;j<=s1.length();j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
