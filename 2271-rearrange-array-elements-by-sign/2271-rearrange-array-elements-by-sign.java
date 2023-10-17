class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];
        int x=0;
        int y=1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                a[x]=nums[i];
                x+=2;
            }
            if(nums[i]<0)
            {
                a[y]=nums[i];
                y+=2;
            }
        }
        return a;
    }
}