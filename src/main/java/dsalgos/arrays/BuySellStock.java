package dsalgos.arrays;

public class BuySellStock {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfitConciseGreedy(prices));
    }

    public static int maxProfit(int[] prices) {

        int buy = prices[0];
        int totalProfit = 0;
        int profit = totalProfit;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            } else {
                buy = prices[i];
                totalProfit += profit;
                profit = 0;
            }
        }

        return totalProfit + profit;
    }

    public static int maxProfitConciseGreedy(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}
