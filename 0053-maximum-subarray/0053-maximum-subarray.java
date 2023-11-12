class Solution {
    public int maxSubArray(int[] nums) {
        int local=0;
        int global=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            local+=nums[i];
            if(global<local)
                global=local;
            if(local<0)
                local=0;
        }
        return global;
    }
}