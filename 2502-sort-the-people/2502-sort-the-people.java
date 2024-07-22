class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> m=new TreeMap<>(Collections.reverseOrder());
        int n=heights.length;
        for(int i=0;i<n;i++){
            m.put(heights[i],names[i]);
        }
        int i=0;
        for(Map.Entry<Integer,String> e:m.entrySet()){
            names[i++]=e.getValue();
        }
        return names;

    }
}