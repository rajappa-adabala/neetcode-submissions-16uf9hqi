class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] chrs=s.toCharArray();
            Arrays.sort(chrs);
            String key=new String(chrs);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }return new ArrayList<>(map.values());

        
    }
}
