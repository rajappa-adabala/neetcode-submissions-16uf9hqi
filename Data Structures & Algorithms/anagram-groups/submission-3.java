class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            int[] ct=new int[26];
            for(char c:s.toCharArray()){
                ct[c-'a']++;

            }
            StringBuilder kb=new StringBuilder();
            for(int i=0;i<26;i++) kb.append(ct[i]).append('#');
            String key=kb.toString();
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }return new ArrayList<>(map.values());
        
    }
}
