class Solution {
    public int findCenter(int[][] edges) {
        int l1=edges[0][0];
        int l2=edges[0][1];
        int r1=edges[1][0];
        int r2=edges[1][1];
        System.out.println(l1+" "+l2+" "+r1+" "+r2);
        if((l1^r1)==0 || (l1^r2)==0)
            return l1;
        if((l2^r1)==0 || (l2^r2)==0)
            return l2;
        return 0;
    }
}