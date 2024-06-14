class Solution {
    public int scoreOfString(String s) {
        int score=0;
        int len=s.length();
        for(int i=1;i<len;i++)
            score+=Math.abs(s.charAt(i)-s.charAt(i-1));
        return score;
    }
}