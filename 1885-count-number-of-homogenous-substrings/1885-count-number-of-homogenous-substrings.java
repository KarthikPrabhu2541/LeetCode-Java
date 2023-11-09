class Solution {
    public int countHomogenous(String s) {
        char c[]=s.toCharArray();
        int local=1;
        int count=1;
        int n=c.length;
        for(int i=1;i<n;i++){
            if(c[i-1]==c[i])
                local++;
            else
                local=1;
            count=(count+local)%((int)Math.pow(10,9)+7);
        }
        return count;
    }
}