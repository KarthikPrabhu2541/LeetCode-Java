class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s=new StringBuilder();
        boolean k=true;
        for(int i=0;i<200;i++)
        {
            if(i>=strs[0].length())
                break;
            char c=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length())
                {
                    k=false;
                    break;
                }
                if(strs[j].charAt(i)!=c)
                {
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