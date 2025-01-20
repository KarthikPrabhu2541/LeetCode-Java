class Solution {
    public int minFlipsMonoIncr(String s) {
        int n = s.length();
        int[] alternate = new int[n];
        int current = 0;
        char charIndex = '0';
        int index = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==charIndex){
                current++;
            }
            else {
                if(charIndex=='0')
                    charIndex = '1';
                 else
                    charIndex = '0';
                alternate[index]=current;                
                index++;
                current = 1;
            }
        }
        alternate[index]=current;                
        index++;
        int size = index;
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
            leftOnes[i]=alternate[2*(i-1)-1]+leftOnes[i-1];
        }
        // for(int i=0;i<arraySize;i++)
        //     System.out.print(leftOnes[i]+" ");
        rightZeroes[arraySize-1]=0;
        for(int i=arraySize-2;i>=0;i-=1){
            rightZeroes[i]=(size<=2*i)?0:alternate[2*i]+rightZeroes[i+1];
        }
        // for(int i=0;i<arraySize;i++)
        //     System.out.print(rightZeroes[i]+" ");
        for(int i=0;i<arraySize;i++){
            minFlips = Math.min(leftOnes[i]+rightZeroes[i],minFlips);
        }
        return minFlips;
    }
}