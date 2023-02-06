package leetCode.easy;

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a
different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0.
 */
public class BestTimeToBuyAndSellStock_121 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        int sellToday = 0;

        for (int price : prices) {
            if (min > price) {
                min = price;
            }

            sellToday = price - min;
            if (profit < sellToday) {
                profit = sellToday;
            }
        }
        return profit;
    }
}
