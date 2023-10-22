class Solution {
    public int minimumSum(int[] nums) {
        int n=nums.length;//length of array nums
        int minsum=Integer.MAX_VALUE;//minimum sum to be returned

        int right[]=new int[n];//prefix array
        int left[]=new int[n];//suffix array

        left[0]=Integer.MAX_VALUE;//initial left value
        right[n-1]=Integer.MAX_VALUE;//initial right value

        for(int i=1;i<n;i++)
            left[i]=Math.min(left[i-1],nums[i-1]);//smallest number to the left of an index
        for(int i=n-2;i>=0;i--)
            right[i]=Math.min(right[i+1],nums[i+1]);//smallest number to the right of an index

        for(int i=0;i<n;i++)//for loop to find minsum 
            if(left[i]<nums[i] && right[i]<nums[i])
                minsum=Math.min(minsum,left[i]+right[i]+nums[i]);//compare triplet with index i as center with minsum

        if(minsum==Integer.MAX_VALUE)
            return -1;//no suitable triplet found
        return minsum; 
    }
}