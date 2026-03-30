class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] s1ct=new int[26];
        int[] s2ct=new int[26];
        for(int i=0;i<s1.length();i++){
            s1ct[s1.charAt(i)-'a']++;
            s2ct[s2.charAt(i)-'a']++;

        }
        if(Arrays.equals(s1ct,s2ct)) return true;

        for (int i=s1.length();i<s2.length();i++){
            s2ct[s2.charAt(i)-'a']++;
            s2ct[s2.charAt(i-s1.length())-'a']--;
            if(Arrays.equals(s1ct,s2ct)) return true;

        }
        return false;

        
    }
}
