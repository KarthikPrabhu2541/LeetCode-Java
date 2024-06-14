class Solution {
    public int longestPalindrome(String s) {
        int c[]=new int[128];
        boolean odd=false;
        for(int a:s.toCharArray())
            c[a]++;
        int palindrome=0;
        for(int i=64;i<123;i++){
            if(c[i]%2==1)
                odd=true;
            palindrome+=c[i]-(c[i]%2);
        }
        palindrome=(odd)?palindrome+1:palindrome;
        return palindrome;
    }
}