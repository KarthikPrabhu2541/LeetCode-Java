class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[] dp = new int[m+1];
        for (int i = 1; i <= n; i++)
        {
            int prev = 0;
            for (int j = 1; j <= m; j++) 
            {
                int temp = dp[j];
                dp[j] = (text1.charAt(i-1) == text2.charAt(j-1)) ? prev + 1:Math.max(dp[j], dp[j-1]);
                prev = temp;
            }
        }
        return dp[m];
    }
}