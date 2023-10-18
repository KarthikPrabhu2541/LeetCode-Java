class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int j=s.length()-1;
        while(j>=0 && s.charAt(j)!=' ')
            j--;
        return s.length()-j-1;
    }
}