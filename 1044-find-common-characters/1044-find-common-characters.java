class Solution {
    public List<String> commonChars(String[] words) {
        int original[]=new int[26];
        int n=words.length;
        for(int a:words[0].toCharArray())
            original[a-97]++;
        for(int i=1;i<n;i++)
            intersection(original,curword(words,i));
        return arrayconvert(original);
    }
    public List<String> arrayconvert(int original[]){
        List<String> result=new ArrayList<>();
         for(int j=0;j<26;j++){
            String a=String.valueOf((char)(j+97));
            for(int k=0;k<original[j];k++)
                result.add(String.valueOf(a));
         }
        return result;
    }
    public int[] curword(String[] words,int i){
        int cur[]=new int[26];
        for(int a:words[i].toCharArray())
                cur[a-97]++;
        return cur;
    }
    public void intersection(int[] original,int[] cur){
        for(int j=0;j<26;j++)
                original[j]=Math.min(original[j],cur[j]);
    }
}