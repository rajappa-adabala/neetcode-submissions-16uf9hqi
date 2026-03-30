class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int xo=0;
        for(int i=0;i<n;i++){
            xo^=i^nums[i];
        }return xo^n;

        
    }
}
