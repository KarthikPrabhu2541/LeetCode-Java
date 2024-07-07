class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinks=numBottles;
        // System.out.println("initial drinks = "+drinks);
        while(numBottles>=numExchange){
            // System.out.println("empty = "+numBottles);
            drinks+=numBottles/numExchange;
            // System.out.println("New = "+numBottles/numExchange+" empty = "+numBottles%numExchange);
            numBottles=numBottles/numExchange+numBottles%numExchange;
        }
        // System.out.println("last empty = "+numBottles);
        // System.out.println("Total Drinks = "+drinks);
        return drinks;
    }
}