class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int num=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
                num=nums[i];
            count=(nums[i]==num)?count+1:count-1;
        }
        return num;
    }
}