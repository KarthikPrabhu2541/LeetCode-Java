class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int k=0,c=x;
        while(c!=0)
        {
            int t=c%10;
            k*=10;
            k+=t;
            c/=10;
        }
        if(k==x)
            return true;
        return false;
    }
}