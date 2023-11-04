class Solution {
    public int totalFruit(int[] fruits) {
       HashMap<Integer,Integer> hm = new HashMap<>();
        int i=0,j=0;
        int total=0,count=0;
        while(j<fruits.length){
            hm.put(fruits[j],hm.getOrDefault(fruits[j],0)+1);
            total +=1;
            while(hm.size()>2){
                int temp= hm.get(fruits[i]);
                hm.put(fruits[i],--temp);
                total-=1;
                if(temp==0)hm.remove(fruits[i]);
                i++;

            }
            count = Math.max(count,total);
            j++;
        }
        return count;
    }
}