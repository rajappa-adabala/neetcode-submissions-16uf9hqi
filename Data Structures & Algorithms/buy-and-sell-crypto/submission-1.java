class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int mx=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int profit=prices[j]-prices[i];
                mx=Math.max(mx,profit);
            }
        }return mx;
    }
}
