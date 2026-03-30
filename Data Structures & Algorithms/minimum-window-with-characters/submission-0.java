

class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        Map<Character, Integer> tc = new HashMap<>();
        for (char c : t.toCharArray()) {
            tc.put(c, tc.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();
        int have = 0, need = tc.size();
        int left = 0, minLen = Integer.MAX_VALUE;
        int resStart = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (tc.containsKey(c) && window.get(c).intValue() == tc.get(c).intValue()) {
                have++;
            }

            while (have == need) {
                // update result
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    resStart = left;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                if (tc.containsKey(leftChar) && window.get(leftChar) < tc.get(leftChar)) {
                    have--;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(resStart, resStart + minLen);
    }
}
