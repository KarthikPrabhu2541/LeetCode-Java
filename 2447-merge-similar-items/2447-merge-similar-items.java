class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer,Integer> m=new TreeMap<>();
        for(int i=0;i<items1.length;i++)
        {
            m.put(items1[i][0],m.getOrDefault(items1[i][0],0)+items1[i][1]);
        }
        for(int i=0;i<items2.length;i++)
        {
            m.put(items2[i][0],m.getOrDefault(items2[i][0],0)+items2[i][1]);
        }
        List<List<Integer>> res = new ArrayList<>();
        int n=m.size();
        for(Map.Entry<Integer,Integer> e:m.entrySet())
        {
            List<Integer> l=new ArrayList<>();
            l.add(e.getKey());
            l.add(e.getValue());
            res.add(l);
        }
        return res;
    }
}