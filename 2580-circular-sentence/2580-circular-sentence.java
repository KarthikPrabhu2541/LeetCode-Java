class Solution {
    public boolean isCircularSentence(String sentence) {
        String s[]=sentence.split("\\s+");
        int n=s.length;
        for(int i=0;i<n;i++)
            if(s[i].charAt(s[i].length()-1)!=s[(i+1)%n].charAt(0))
                return false;
        return true;
    }
}