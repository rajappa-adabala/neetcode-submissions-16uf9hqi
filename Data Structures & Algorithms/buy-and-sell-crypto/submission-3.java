class Solution {
    public int maxProfit(int[] prices) {
        int mxprofit=0,curr=0;
        for(int i=1;i<prices.length;i++){
            curr+=prices[i]-prices[i-1];
            if(curr<0) curr=0;
            mxprofit=Math.max(mxprofit,curr);
        }return mxprofit;
        
    }
}
