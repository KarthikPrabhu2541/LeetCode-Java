class Solution {
    public boolean isAnagram(String s, String t) {
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String ss=new String(a);
        String tt=new String(b);
        if(ss.equals(tt))
            return true;
        return false;
    }
}