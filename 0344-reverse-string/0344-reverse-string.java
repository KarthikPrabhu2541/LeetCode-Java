class Solution {
    public void reverseString(char[] s) {
        int a=0,b=s.length-1;
        char t;
        while(a<b){
            t=s[a];
            s[a]=s[b];
            s[b]=t;
            a++;
            b--;
        }
    }
}