class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> a=new ArrayList<>();
        int n=nums1.length;
        for(int i:nums1)
            a.add(i);
        List<Integer> result=new ArrayList<>();        
        for(int i:nums2){
            if(a.contains(i))
            {
                result.add(i);
                a.remove(Integer.valueOf(i));
            }
        }
        int res[]=new int[result.size()];
        int k=0;
        for(int i:result)
            res[k++]=i;
        return res;
    }
}