class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char a[]=text1.toCharArray();
        char b[]=text2.toCharArray();
        int n=text1.length();
        int m=text2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<=n;i++)
            for(int j=1;j<=m;j++)
                    dp[i][j]=(a[i-1]==b[j-1])?dp[i-1][j-1]+1:Math.max(dp[i-1][j],dp[i][j-1]);                
        return dp[n][m];
    }
}