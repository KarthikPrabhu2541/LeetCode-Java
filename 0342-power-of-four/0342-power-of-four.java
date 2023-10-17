class Solution {
    public boolean isPowerOfFour(int n) {
        double x = Math.log(n)/Math.log(4);
        if(x-(double)(int)(x)==0.0)
            return true;
        else
        return false;
    }
}