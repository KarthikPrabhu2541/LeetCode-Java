class Solution {
    public boolean isPowerOfFour(int n) {
        if(Math.log(n)/Math.log(4)-(double)(int)(Math.log(n)/Math.log(4))==0.0)
            return true;
        else
        return false;
    }
}