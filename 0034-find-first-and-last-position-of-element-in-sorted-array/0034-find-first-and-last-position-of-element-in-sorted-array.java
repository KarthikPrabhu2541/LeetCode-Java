class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                ans[0]=i;
                break;
            }
        }
        if(i==nums.length)
        {
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        while(i<nums.length && nums[i]==target)
        {
            i++;
        }
        ans[1]=i-1;
        return ans;
    }
}