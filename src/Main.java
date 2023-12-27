public class Main {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];
            if (prices[i] > min) {
                int temp = prices[i] - min;
                if (profit < temp) profit = temp;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}