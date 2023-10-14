class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        ArrayList<Character> l=new ArrayList<>();
        int count=0;
        char stone[]=stones.toCharArray();
        char jewel[]=jewels.toCharArray();
        for(char c:jewel)
            l.add(c);
        for(int i=0;i<stone.length;i++)
        {
            if(l.contains(stone[i]))
                count++;
        }
        return count;
    }
}