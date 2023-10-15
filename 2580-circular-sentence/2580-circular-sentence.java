class Solution {
    public boolean isCircularSentence(String sentence) {
        if(sentence.charAt(sentence.length()-1)!=sentence.charAt(0))return false;
        String str []=sentence.split("\\s");
        int n = str.length;
        for(int i=0;i<n-1;i++){
            if(str[i].charAt(str[i].length()-1)!= str[i+1].charAt(0))return false;
        }
         
        return true;
    }
}