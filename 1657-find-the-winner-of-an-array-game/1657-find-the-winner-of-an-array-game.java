class Solution {
    public int getWinner(int[] arr, int k) {
        List<Integer> l=new ArrayList<>();
        for(int i:arr)
            l.add(i);
        int n=arr.length;
        int count=0;
        int winner=l.get(0);
        while(count<k){
            int a=l.get(0);
            int b=l.get(1);
            if(a>b){
                l.remove(1);
                l.add(b);
                count++;
                winner=a;
            }  
            else{
                l.remove(0);
                l.add(a);
                winner=b;
                count=1;
            }
            if(count==k)
                return winner;
            if(count>n)
                return winner;
        }
        return winner;
    }
}