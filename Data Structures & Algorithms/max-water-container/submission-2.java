class Solution {
    public int maxArea(int[] heights) {
        int left=0,right=heights.length-1;
        int mx=0;
        while(left<right){
            int h=Math.min(heights[left],heights[right]);
            int w=right-left;
            mx=Math.max(mx,h*w);
            if(heights[left]<heights[right]) left++;
            else right--;
        }return mx;
    }
}
