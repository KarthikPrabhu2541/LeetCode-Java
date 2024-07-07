class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinks=numBottles;
        while(numBottles>=numExchange){
            drinks+=numBottles/numExchange;
            numBottles=numBottles/numExchange+numBottles%numExchange;
        }
        return drinks;
    }
}