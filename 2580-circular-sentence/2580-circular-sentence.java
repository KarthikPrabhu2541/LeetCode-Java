class Solution {
    public boolean isCircularSentence(String sentence) {
        String s[]=sentence.split("\\s+");
        int n=s.length;
        for(int i=0;i<n;i++)
        {
            char a=s[i].charAt(s[i].length()-1);
            char b=s[(i+1)%n].charAt(0);
            if(a!=b)
                return false;
        }
        return true;
    }
}