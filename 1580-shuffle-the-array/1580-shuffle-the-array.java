class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int j=n;
        while(i<2*n && j<2*n)
        {
            i++;
            int temp=nums[j];
            for(int k=j;k>i;k--)
            {
                nums[k]=nums[k-1];
            }
            nums[i]=temp;
            i++;
            j++;
        }
        return nums;
    }
}