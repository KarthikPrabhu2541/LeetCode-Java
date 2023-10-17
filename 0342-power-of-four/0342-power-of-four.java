class Solution {
    public boolean isPowerOfFour(int n) {
        double x=Math.log(n)/Math.log(4);
        System.out.println(x);
        int t=(int)x;
        double tt=t;
        if(tt-x==0.0)
            return true;
        else
        return false;
    }
}