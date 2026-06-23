class Solution {
    public int maxProfit(int[] prices) {
       int l =0,r=1,profit =0,ans=0;
       while(r<prices.length){
        if(prices[l]<prices[r]){
            profit = prices[r] - prices[l];
            ans = Math.max(profit,ans);
        }
        else{
            l =r;
        }
        r++;
       }
       return ans;
        
}
}