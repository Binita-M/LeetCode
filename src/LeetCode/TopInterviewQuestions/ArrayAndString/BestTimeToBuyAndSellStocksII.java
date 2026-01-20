package LeetCode.TopInterviewQuestions.ArrayAndString;

public class BestTimeToBuyAndSellStocksII {
    int maxProfit (int[] prices) {
        int profit = 0;

        for (int i=1; i<prices.length; i++) {
           if (prices[i] > prices[i-1]) {
               profit += prices[i] - prices[i-1];
           }
        }
        return profit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStocksII bttbassii = new BestTimeToBuyAndSellStocksII();

        /*int[] prices = {7,1,5,3,6,4};
        int result = bttbassii.maxProfit(prices);*/

        int[] prices = {1,2,3,4,5};
        int result = bttbassii.maxProfit(prices);

        System.out.println(result);
    }
}
