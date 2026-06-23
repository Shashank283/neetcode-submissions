class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int ans = 0;
        for(int s = 0 ; s< prices.length; s++){
            
            for(int e = s+1 ; e<prices.length ; e++){
                profit = prices[e] - prices[s];
                ans = Math.max(ans,profit);
            }
        }

        return ans;
    }
}