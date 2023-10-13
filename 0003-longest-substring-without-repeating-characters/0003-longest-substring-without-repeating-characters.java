class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxcount=0;
        int index;
        Map<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(h.containsKey(c))
            {
                index=h.get(c);
                maxcount=Math.max(h.size(),maxcount);
                h.clear();
                for(int j=index+1;j<i;j++)
                    h.put(s.charAt(j),j);
            }
                h.put(c,i);
        }
        maxcount=Math.max(h.size(),maxcount);
        return maxcount;
    }
}