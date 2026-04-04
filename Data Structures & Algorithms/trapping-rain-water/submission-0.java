class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int water=0;
        for(int i=0;i<n;i++){
            int lmax=0,rmax=0;
            for(int j=0;j<=i;j++) lmax=Math.max(lmax,height[j]);
            for(int j=i;j<n;j++) rmax=Math.max(rmax,height[j]);
            water+=Math.min(lmax,rmax)-height[i];

        }return water;
        
    }
}
