class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> t=new TreeSet<>();
        int n=nums.length;
        for(int i:nums)
            t.add(i);
        Iterator itr=t.iterator();
        if(!itr.hasNext())
            return 0;
        int prev=(int)itr.next();
        int count=1;
        int total=0;
        while(itr.hasNext())
        {
            int cur=(int)itr.next();
            if(cur==prev+1)
                count++;
            else
            {
                total=Math.max(count,total);
                count=1;
            }
            prev=cur;
        }
        total=Math.max(count,total);
        return total;
    }
}