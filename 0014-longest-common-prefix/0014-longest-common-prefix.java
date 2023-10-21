class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s=new StringBuilder();
        boolean k=true;
        int n=strs[0].length();
        for(int i=0;i<200 && i<n;i++){
            char c=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=c){
                    k=false;
                    break;
                }
            }
            if(k)
                s.append(c);
            else break;
        }
        return s.toString();
    }
}