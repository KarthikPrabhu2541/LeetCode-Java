class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            h.put(c,h.getOrDefault(c,0)+1);
        }
        boolean f=false;
        int count=0;
        for(Map.Entry<Character,Integer> e:h.entrySet()){
            int val=e.getValue();
            if(val%2==1 && !f){
                f=true;
                count++;
            }
            count+=(val-(val%2));
        }
        return count;
    }
}