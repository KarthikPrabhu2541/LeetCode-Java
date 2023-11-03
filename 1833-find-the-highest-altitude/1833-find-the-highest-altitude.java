class Solution {
    public int largestAltitude(int[] gain) {
        int current=0;
        int altitude=Integer.MIN_VALUE;
        for(int i:gain){
            altitude=Math.max(altitude,current);
            current+=i;
        }
        altitude=Math.max(altitude,current);
        return altitude;
    }
}