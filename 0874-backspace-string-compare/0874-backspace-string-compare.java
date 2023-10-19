class Solution {
    StringBuilder sb=new StringBuilder();
    public boolean backspaceCompare(String s, String t) {
        return editor(s).equals(editor(t));
    }
    public String editor(String s)
    {
        sb.setLength(0);
        for(int i=0;i<s.length();i++)
        {
            int len=sb.length()-1;
            if(s.charAt(i)=='#' && len>=0)
                sb.deleteCharAt(len);
            else if(s.charAt(i)=='#');
            else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}