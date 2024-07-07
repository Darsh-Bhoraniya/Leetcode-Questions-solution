public class Water_Bottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles;
        while(numBottles>=numExchange){
            int reminder = numBottles%numExchange;
            numBottles/=numExchange;
            result += numBottles;
            numBottles  = numBottles + reminder;
        }
        return result;
    }
}
