class Solution {
    public boolean isCircularSentence(String sentence) {
        String s[]=sentence.split("\\s+");
        int n=s.length;
        for(int i=0;i<n;i++)
        {
            int k=s[i].length();
            char a=s[i].charAt(k-1);
            char b=s[(i+1)%n].charAt(0);
            System.out.println(a+" "+b);
            if(a!=b)
                return false;
        }
        return true;
    }
}