class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int mx=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int h=Math.min(heights[i],heights[j]);
                int w=j-i;
                mx=Math.max(mx,h*w);
            }
        }return mx;
        
    }
}
