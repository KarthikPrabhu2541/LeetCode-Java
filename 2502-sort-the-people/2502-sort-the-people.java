class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> m=new HashMap<>();
        int n=heights.length;
        for(int i=0;i<n;i++){
            m.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for(int i=n-1;i>=0;i--){
            names[n-1-i]=m.get(heights[i]);
        }
        return names;

    }
}