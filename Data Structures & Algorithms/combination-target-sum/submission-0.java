class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(nums,0,target,new ArrayList<>(),res);
        return res;
        
    }
    public void backtrack(int[]nums,int start,int target,List<Integer>path,List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(path));
            return;
        }
        if(target<0)return ;
        for(int i=start;i<nums.length;i++){
            path.add(nums[i]);
            backtrack(nums,i,target-nums[i],path,res);
            path.remove(path.size()-1);
        }
    }
}
