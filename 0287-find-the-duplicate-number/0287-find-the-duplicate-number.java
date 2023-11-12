class Solution {
    public int findDuplicate(int[] nums) {
        int []ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(ans[nums[i]]==1){return nums[i];}
            ans[nums[i]]=1;
        }
        return 0;
}
}