class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=-1;
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    int k=j+1;
                    while(k<m && nums2[k]<=nums2[j])
                        k++;
                    if(k<m)
                        a[i]=nums2[k--];
                    break;
                }
            }
        }
        return a;
    }
}