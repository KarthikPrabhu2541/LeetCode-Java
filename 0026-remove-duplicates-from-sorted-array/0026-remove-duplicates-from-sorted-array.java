class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1,prev=nums[0];
        for(int i=1;i<nums.length;i++)
            if(nums[i]!=prev)
            {
                prev=nums[i];
                nums[k++]=nums[i];
            }
        return k;
    }
}