package Arrays.April.Easy.eighteen;

public class Buy_And_Sell_Stocks {
    public static int find_max_profit(int[] prices)
    {
        int maxprofit=0, minprice =Integer.MAX_VALUE;
        for(int i = 0;i<prices.length;i++) {
            if(prices[i]<minprice)
            {
                minprice = prices[i];
            }
            else {
                maxprofit = Math.max((prices[i]-minprice),maxprofit);
            }

        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxprofit = find_max_profit(prices);
        System.out.println("Maxprofit is"+maxprofit);
    }

}
