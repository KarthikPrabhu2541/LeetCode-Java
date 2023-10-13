class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        double result = 0;
        boolean pos=true;
        if(s.length()==0)
            return 0;
        int i=0;
        if(s.charAt(i)=='+' && i+1<s.length() && Character.isDigit(s.charAt(i+1)))
        {
            i++;
            pos=true;
        }
        else if(s.charAt(i)=='-' && i+1<s.length() && Character.isDigit(s.charAt(i+1)))
        {
            i++;
            pos=false;
        }
        else if(!Character.isDigit(s.charAt(i)))
            return 0;

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0'); 
            i++;
        }
        if (!pos)
            result = -result;

        int MAX = (int) Math.pow(2, 31);
        int MIN = (int) Math.pow(-2, 31);

        result=Math.max(MIN,Math.min(MAX,result));
        return (int)result;
    }
}