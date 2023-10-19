class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int x=0;
        int i=str1.length(),j=str2.length();
        StringBuilder s=new StringBuilder();
        String m="";
        while(x<i && x<j)
        {
            s.append(str1.charAt(x));
            int k,l;x++;
            String str=s.toString();
            for(k=0;k+x<=i && (str1.substring(k,k+x)).equals(str)==true ;k+=x);
            for(l=0;l+x<=j &&(str2.substring(l,l+x)).equals(str)==true ;l+=x);
            if(k==i && l==j && m.length()<s.length())
                    m=s.toString();
        }
        System.gc();
        return m.toString();
    }
}