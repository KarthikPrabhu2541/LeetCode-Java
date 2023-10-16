class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            h.put(c,h.getOrDefault(c,0)+1);
        }
           
        for(int i=0;i<t.length();i++)
        {
            char c=t.charAt(i);
            if(h.containsKey(c) && h.get(c)>1)
                h.put(c,h.get(c)-1);
            else if(h.containsKey(c))
                h.remove(c);
            else 
                return false;
        }
        if(h.isEmpty())
            return true;
        return false;
    }
}