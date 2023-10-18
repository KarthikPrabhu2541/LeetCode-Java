class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        for(Map.Entry<Integer,Integer> e:m.entrySet())
        {
            if(e.getValue()==1)
                return e.getKey();
        }
        return -1;
    }
}