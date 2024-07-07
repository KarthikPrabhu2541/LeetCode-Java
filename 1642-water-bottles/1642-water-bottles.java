class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int current=numBottles;
        int drinks=numBottles;
        // System.out.println("initial drinks = "+drinks);
        while(current>=numExchange){
            // System.out.println("empty = "+current);
            drinks+=current/numExchange;
            // System.out.println("New = "+current/numExchange+" empty = "+current%numExchange);
            current=current/numExchange+current%numExchange;
        }
        // System.out.println("last empty = "+current);
        // System.out.println("Total Drinks = "+drinks);
        return drinks;
    }
}