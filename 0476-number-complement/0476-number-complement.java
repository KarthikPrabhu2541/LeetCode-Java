class Solution {
    public int findComplement(int num) {
        //index value of the most significant bit
        int mostSigniBitIndex = (int)(Math.log(num)/Math.log(2)); 
        // maximum value possible for the length of binary number 101 => 7 for length 3
        int maxValue = ((int)Math.pow(2,mostSigniBitIndex))*2-1; 
        //the difference of maxvalue and number is the complement of the number
        return maxValue-num;
    }
}