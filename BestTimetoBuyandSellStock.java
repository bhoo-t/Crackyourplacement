class Solution {
    public int maxProfit(int[] prices) {
        int profit=0, cheapest_price=Integer.MAX_VALUE;
        int curr_profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<cheapest_price) cheapest_price=prices[i];
            curr_profit =prices[i]-cheapest_price;
            if(curr_profit>profit) profit=curr_profit;
        }
        return profit;
    }
}
