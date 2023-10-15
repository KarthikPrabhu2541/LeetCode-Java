class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int low = 0 , high = nums.length-1; long ans = 0L;
        StringBuilder temp = new StringBuilder();
        while(low<=high){
            if(low!=high) temp.append(nums[low]).append(nums[high]);
            else temp.append(nums[low]);
            low++; high--;
            ans+=(Integer.parseInt(temp.toString()));
            temp.setLength(0);
        }
        return ans;

        //      ANOTHER SOLUTION(try this one)

        // long ans = 0L;
        // int low = 0 , high = nums.length-1;
        // while(low <= high){
        //     String str1 = Long.toString(nums[low]) , str2 = Long.toString(nums[high]);
        //     str1 = str1 + str2;
        //     if(low == high) ans += nums[low]; 
        //     else ans +=(Long.parseLong(str1));
        //     low++; high--;
        // }
        // return ans;
    }
}