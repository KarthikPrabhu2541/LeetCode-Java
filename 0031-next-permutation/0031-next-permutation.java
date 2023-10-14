class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length<=1)
            return;
        int i = nums.length -2;
        while(i >=0 && nums[i]>=nums[i+1])
            i--;
        if(i>=0)
        {
            int j=nums.length-1;
            while(nums[j]<=nums[i])
                j--;
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        int a=i+1;
        int b=nums.length-1;
        while(a<b)
        {
            int temp=nums[a];
            nums[a]=nums[b];
            a++;
            nums[b]=temp;
            b--;
        }
    }
}