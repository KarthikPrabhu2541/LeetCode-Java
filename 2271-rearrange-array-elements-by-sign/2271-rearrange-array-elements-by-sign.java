class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length,x=0,y=1;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                a[x]=nums[i];x+=2;
            }
            else{
                a[y]=nums[i];y+=2;
            }
        }
        return a;
    }
}