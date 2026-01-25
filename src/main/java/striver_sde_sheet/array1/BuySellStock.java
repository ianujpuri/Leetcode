package striver_sde_sheet.array1;

public class BuySellStock {

    public static void main(String[] args) {
        int[] prices = {19,15,15,14,12,31};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int min = 0;
        int max = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < prices[min]) {
                min = i;
                max = Math.max(max, min);
            } else if (prices[i] > prices[max]) {
                max = i;
            }
        }

        return prices[max] - prices[min];
    }

}
