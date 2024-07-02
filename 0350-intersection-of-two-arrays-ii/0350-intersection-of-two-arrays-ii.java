class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> h=new HashMap<>();
        int n=nums1.length;
        for(int i:nums1)
            h.put(i,h.getOrDefault(i,0)+1);
        List<Integer> result=new ArrayList<>();        
        for(int i:nums2){
            if(h.containsKey(i))
            {
                result.add(i);
                h.put(i,h.getOrDefault(i,0)-1);
                if(h.get(i)==0)
                    h.remove(i);
            }
        }
        int res[]=new int[result.size()];
        int k=0;
        for(int i:result)
            res[k++]=i;
        return res;
    }
}