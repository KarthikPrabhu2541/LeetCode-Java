class Solution {
    public int minFlipsMonoIncr(String s) {
        int n = s.length();
        List<Integer> alternate = new ArrayList<Integer>();
        int current = 0;
        char index = '0';
        for(int i=0;i<n;i++){
            if(s.charAt(i)==index){
                current++;
            }
            else {
                if(index=='0')
                    index = '1';
                 else
                    index = '0';
                alternate.add(current);
                current = 1;
            }
        }
        alternate.add(current);
        int size = alternate.size();
        int minFlips = Integer.MAX_VALUE;
        if(size == 1 || size == 2){
            return 0;
        }
        int arraySize = size/2+2;
        int leftOnes[] = new int[arraySize];
        int rightZeroes[] = new int[arraySize];
        leftOnes[0]=0;
        leftOnes[1]=0;
        for(int i=2;i<arraySize;i++){
            leftOnes[i]=alternate.get(2*(i-1)-1)+leftOnes[i-1];
        }
        // for(int i=0;i<arraySize;i++)
        //     System.out.print(leftOnes[i]+" ");
        rightZeroes[arraySize-1]=0;
        for(int i=arraySize-2;i>=0;i-=1){
            rightZeroes[i]=(size<=2*i)?0:alternate.get(2*i)+rightZeroes[i+1];
        }
        // for(int i=0;i<arraySize;i++)
        //     System.out.print(rightZeroes[i]+" ");
        for(int i=0;i<arraySize;i++){
            minFlips = Math.min(leftOnes[i]+rightZeroes[i],minFlips);
        }
        return minFlips;
    }
}