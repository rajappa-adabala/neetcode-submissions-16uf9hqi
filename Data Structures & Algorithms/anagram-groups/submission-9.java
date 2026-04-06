class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            int[] ct=new int[26];
            for(char c:s.toCharArray()) ct[c-'a']++;
            StringBuilder key=new StringBuilder();
            for(int i:ct) key.append(i).append('#');
            map.putIfAbsent(key.toString(),new ArrayList<>());
            map.get(key.toString()).add(s);
        }return new ArrayList<>(map.values());

        
    }
}
