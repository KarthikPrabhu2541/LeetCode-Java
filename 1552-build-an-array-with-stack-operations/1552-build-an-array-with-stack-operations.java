class Solution {
    public List<String> buildArray(int[] target, int n) {
        int k=1;
        List<String> s=new ArrayList<>();
        for(int i:target){
            while(k<i){
                s.add("Push");
                s.add("Pop");
                k++;
            }
            if(k++==i){
                s.add("Push");
            }
        }
        return s;
    }
}