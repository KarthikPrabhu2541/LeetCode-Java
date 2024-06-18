class Solution {
    public void swap(int[] difficulty,int[] profit,int i,int j ){
        int temp=difficulty[i];
        difficulty[i]=difficulty[j];
        difficulty[j]=temp;
        temp=profit[i];
        profit[i]=profit[j];
        profit[j]=temp;
    }
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n=worker.length;        
        for(int i=1;i<n;i++)
            for(int j=1;j<=n-i;j++)
                if(profit[j]>profit[j-1])
                    swap(difficulty,profit,j-1,j);
        // for(int i:difficulty)
        //     System.out.print(i+" ");
        // System.out.println();
        // for(int i:profit)
        //     System.out.print(i+" ");
        // System.out.println();
        int finalProfit=0;
        for(int i=0;i<n;i++){
            int j=0;
            for(;j<n;j++){
                if(difficulty[j]<=worker[i])
                    break;
            }
            if(j!=n)
            {
                finalProfit+=profit[j];
                // System.out.println(worker[i]+" "+profit[j]);
            }
        }
        return finalProfit;
    }
}