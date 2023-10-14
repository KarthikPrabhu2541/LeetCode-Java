class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        int count=0;
        for(int n:nums)
        {
            int i=m.getOrDefault(n,0);
            count+=i;
            m.put(n,i+1);
        }
        return count;
    }
    
}