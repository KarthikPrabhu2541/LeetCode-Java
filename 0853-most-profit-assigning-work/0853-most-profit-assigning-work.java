class Solution {
   
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int m=worker.length;
        int n=difficulty.length;
        int maxDiff=0;
        for(int i:difficulty)
            maxDiff=Math.max(i,maxDiff);
        int[] profs=new int[maxDiff+1];
        for(int i=0;i<n;i++)
            profs[difficulty[i]]=Math.max(profs[difficulty[i]],profit[i]);
        for(int i=1;i<=maxDiff;i++)
            profs[i]=Math.max(profs[i],profs[i-1]);
        // for(int i=0;i<maxDiff+1;i++)
        //     System.out.println(i+" "+profs[i]);
        int finalProfit=0;
        for(int i=0;i<m;i++){
            int diff=Math.min(worker[i],maxDiff);
            finalProfit+=profs[diff];
        }
        return finalProfit;
    }
}