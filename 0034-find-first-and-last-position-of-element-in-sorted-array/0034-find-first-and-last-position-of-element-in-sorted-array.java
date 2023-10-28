class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];
        int l=0,r=nums.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]<target)
                l=mid+1;
            else  
                r=mid-1;
        }
        if(r+1<nums.length && nums[r+1]==target)
            ans[0]=r+1;
        else
            ans[0]=-1;
        l=0;r=nums.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]<=target)
                l=mid+1;
            else  
                r=mid-1;
        }
        if(r>=0 && nums[r]==target)
            ans[1]=r;
        else
            ans[1]=-1;
        return ans;
    }
}