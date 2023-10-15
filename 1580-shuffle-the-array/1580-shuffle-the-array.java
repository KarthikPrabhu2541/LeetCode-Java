class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[]=new int[2*n];
        int k=0;
        int j=n,i=0;
        while(j<2*n)
        {
            a[k++]=nums[i++];
            a[k++]=nums[j++];
        }
        System.gc();
        return a;
    }
}