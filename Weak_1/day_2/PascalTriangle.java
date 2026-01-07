public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;

        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][0] = dp[i][i] = 1;

            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
}

