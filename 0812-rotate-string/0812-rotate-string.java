class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder str=new StringBuilder();
        str.append(s).append(s);
        if(s.length()!=goal.length())
            return false;
        return (str.toString().indexOf(goal)>=0);
    }
}