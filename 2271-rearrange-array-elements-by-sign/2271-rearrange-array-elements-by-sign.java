class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> even = new ArrayList<Integer>();
         ArrayList<Integer> odd = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0)
             even.add(nums[i]);
             else
             odd.add(nums[i]);
        }

        for(int i=0;i<nums.length;i=i+2){
          nums[i] = even.get(i/2);
        }
        for(int i=1;i<nums.length;i=i+2){
          nums[i] = odd.get(i/2);
        }
     return nums;
    }
}