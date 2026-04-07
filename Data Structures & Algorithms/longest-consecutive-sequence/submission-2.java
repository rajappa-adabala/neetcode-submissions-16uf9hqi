class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        // Step 1: Add all elements
        for(int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Check for sequence starts
        for(int num : set) {
            if(!set.contains(num - 1)) { // start
                int curr = num;
                int count = 1;

                // Step 3: Expand sequence
                while(set.contains(curr + 1)) {
                    curr++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}