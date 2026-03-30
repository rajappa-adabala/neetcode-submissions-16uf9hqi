class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0) return new ArrayList<>();
        Map<String,List<String>> map= new HashMap<>();
        for (String s:strs){
            char[] carr=s.toCharArray();
            Arrays.sort(carr);
            String key=new String(carr);
            map.computeIfAbsent(key,k-> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());

        
    }
}
