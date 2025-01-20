class Solution {
    public int minFlipsMonoIncr(String s) {
        int n = s.length();

        int leftOnes[] = new int[n+2];
        leftOnes[0]=0;
        leftOnes[1]=0;
        for(int i=2;i<n+2;i++){
            int one = (s.charAt(i-2)=='1')?1:0;
            leftOnes[i]=leftOnes[i-1]+one;
        }

        // for(int i=0;i<=n+1;i++)
        //     System.out.print(leftOnes[i]+" ");
        // System.out.println();

        int rightZeroes[] = new int[n+2]; 
        rightZeroes[n+1]=0;
        rightZeroes[n]=0;
        for(int i=n-1;i>=0;i--){
            int zero = (s.charAt(i)=='0')?1:0;
            rightZeroes[i]=rightZeroes[i+1]+zero;
        }

        // for(int i=0;i<=n+1;i++)
        //     System.out.print(rightZeroes[i]+" ");

        int minFlips = Math.min(leftOnes[0]+rightZeroes[0], leftOnes[n+1]+rightZeroes[n+1]);
        for(int i=1;i<=n;i++){
                int one = (s.charAt(i-1)=='0')?1:0;
                minFlips = Math.min(leftOnes[i]+rightZeroes[i]+one,minFlips);
        }
        return minFlips;
    }
}