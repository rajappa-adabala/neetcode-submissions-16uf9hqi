class Solution {
    public int maxProfit(int[] prices) {
        int minp=Integer.MAX_VALUE;
        int mp=0;
        for(int price:prices){
            if(price<minp) minp=price;
            else mp=Math.max(mp,price-minp);
        }return mp;
        
    }
}
