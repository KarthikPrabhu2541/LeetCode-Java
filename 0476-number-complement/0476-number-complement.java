class Solution {
    public int findComplement(int num) {
        int a = (int)(Math.log(num)/Math.log(2));
        int total = ((int)Math.pow(2,(int)(Math.log(num)/Math.log(2))))*2-1;
        return (((int)Math.pow(2,(int)(Math.log(num)/Math.log(2))))*2-1)-num;
    }
}