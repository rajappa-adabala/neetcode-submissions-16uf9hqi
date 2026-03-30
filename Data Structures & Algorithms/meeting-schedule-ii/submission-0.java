/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals==null || intervals.size()==0) return 0;
        intervals.sort((a,b)->Integer.compare(a.start,b.start));
        PriorityQueue<Integer> minp=new PriorityQueue<>();
        minp.add(intervals.get(0).end);
        for(int i=1;i<intervals.size();i++){
            Interval curr=intervals.get(i);
            if(curr.start>=minp.peek()){
                minp.poll();

            }
            minp.add(curr.end);

        }
        return minp.size();


    }
}
