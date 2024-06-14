class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashMap<String,Integer> map = new HashMap<>();
        for (String word : dictionary) {
            map.put(word, 1);
        }
        StringBuilder s=new StringBuilder();
        String sent[]=sentence.split("\\s+");
        for(String cur:sent){
            String word="";
            for(int i=1;i<=cur.length();i++){
                word=cur.substring(0,i);
                if(map.containsKey(word))
                    break;
            }
            s.append(word).append(" ");
        }
        return (s.toString()).trim();
    }
}