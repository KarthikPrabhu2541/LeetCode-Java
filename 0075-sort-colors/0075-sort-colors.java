class Solution {
    public void sortColors(int[] nums) {
        int []colors=new int[3];
        for(int i:nums){
            colors[i]++;
        }
        int k=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<colors[i];j++){
                nums[k++]=i;
            }
        }
    }
}