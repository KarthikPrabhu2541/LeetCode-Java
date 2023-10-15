class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<>();
        Set<Integer> s=new HashSet<>();
        for(int a:nums)
        {
            if(s.contains(a))
                l.add(a);
            else
                s.add(a);
        }
        return l;
    }
}