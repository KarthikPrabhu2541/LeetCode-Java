class Solution {
    public int maxSubArray(int[] nums) {
        int local=nums[0];
        int global=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            local=Math.max(local+nums[i],nums[i]);
            global=Math.max(local,global);
        }
        return global;
    }
}