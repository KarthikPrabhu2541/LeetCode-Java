class Solution {
    public int romanToInt(String s) {
        int prev=0,total=0;
        int cur=0;
        for(int i=0;i<s.length();i++)
        {
            cur = count(s.charAt(i));
            if(prev!=0 && prev<cur)
                total+=cur-2*prev;
            else
                total+=cur;
            prev=cur;
        }
        return total;
    }
    public static int count(char c)
    {
        switch(c)
        {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
        }
        return 0;
    }
}