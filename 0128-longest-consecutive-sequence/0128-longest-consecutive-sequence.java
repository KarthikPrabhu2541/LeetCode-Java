class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int total=0;
        int n=nums.length;
        if(n==0)
            return 0;
        int prev=nums[0];
        for(int i=1;i<n;i++)
        {
            int cur=nums[i];
            if(cur==prev+1)
                count++;
            else if(cur==prev);
            else
            {
                total=Math.max(count,total);
                count=1;
            }
            prev=cur;
        }
        total=Math.max(count,total);
        return total;
    }
}