class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int[] ct=new int[26];
        for(char c:s.toCharArray()) ct[c-'a']++;
        for(char c:t.toCharArray()) ct[c-'a']--;
        for(int val:ct) if(val!=0) return false;
        return true;

    }
}
