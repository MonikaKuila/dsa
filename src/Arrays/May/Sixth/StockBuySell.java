package Arrays.May.Sixth;

import java.util.stream.Gatherer;
/*🧠 One-Line Memory Trick

👉

Track minimum so far and calculate profit today.*/

public class StockBuySell {

    public static int StockBuySell(int[] prices) {
        if(prices == null || prices.length == 0) {
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;
        int maxPricediff = 0;
        for(int i=0;i<prices.length; i++) {
           if(prices[i] < minPrice) {
               minPrice = prices[i];
           }

          int pricesDiff = prices[i] - minPrice;
           if(pricesDiff > maxPricediff)
           {
               maxPricediff = pricesDiff;
           }

        }
        return maxPricediff;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int[] prices1 = {7,1,5,3,6,4};
        int maxPricediff = StockBuySell(prices1);
        System.out.println("max price difference is"+maxPricediff);

    }
}
