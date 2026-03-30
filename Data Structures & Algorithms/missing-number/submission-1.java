class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int tsum=n*(n+1)/2;
        int acsum=0;
        for(int num:nums){
            acsum+=num;
        }
        return tsum-acsum;


        
    }
}
