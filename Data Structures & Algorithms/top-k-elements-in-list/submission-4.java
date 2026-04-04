class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums) map.put(num,map.getOrDefault(num,0)+1);
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));
        List<Integer>[] bucket=new ArrayList[nums.length+1];
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();

            }bucket[freq].add(key);

        }
        int[] res=new int[k];
        int idx=0;
        for(int i=bucket.length-1;i>=0 && idx<k;i--){
            if(bucket[i]!=null){
                for(int num: bucket[i]){
                    res[idx++]=num;
                    if(idx==k) break;
                }
            }
        }return res;
    }
}
