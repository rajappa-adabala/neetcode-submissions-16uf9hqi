class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int ct=0;
        int end=Integer.MIN_VALUE;
        for(int[] inter:intervals){
            if(inter[0]>=end){
                end=inter[1];
                ct++;
            }
        }
        return intervals.length-ct;
        
    }
}
