class Solution {
    public int trap(int[] height) {
        int water=0,lmax=0,rmax=0,left=0,right=height.length-1;

        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=lmax) lmax=height[left];
                else water+=lmax-height[left];
                left++;
            }else{
                if(height[right]>=rmax) rmax=height[right];
                else water+=rmax-height[right];
                right--;
            }
        }return water;
    }
}
