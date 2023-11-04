class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cons=0,maxcons=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1)
                cons++;
            else
                cons=0;
            maxcons=Math.max(maxcons,cons);
        }
        maxcons=Math.max(maxcons,cons);
        return maxcons;
    }
}