class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int count=0;
        int total=0;
        for(int i:nums)
            s.add(i);
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            count=0;
            int a=(int)itr.next();
            if(!s.contains(a-1))
            {
                while(s.contains(a++))
                    count++;
            }
            total=Math.max(count,total);
        }
        return total;
    }
}