class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int num=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(count==0)
                num=nums[i];
            if(count>n/2)
                return num;
            count=(nums[i]==num)?count+1:count-1;
        }
        return num;
    }
}