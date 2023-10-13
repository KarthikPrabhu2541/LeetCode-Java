class Solution {
    int a[];
    public int minCostClimbingStairs(int[] cost) {
        
        int n=cost.length;
        a=new int[n];
        return steps(cost,-1,n);
    }
    int steps(int cost[],int i,int n)
    {
        if(i==n)
            return 0;
        if(i>n)
            return Integer.MAX_VALUE;
        if(i!=-1 && a[i]!=0)
            return a[i];
        int cur=(i==-1)?0:cost[i];
        int total=cur+Math.min(steps(cost,i+1,n),steps(cost,i+2,n));
        if(i!=-1)
            a[i]=total;
        return total;
    }
}