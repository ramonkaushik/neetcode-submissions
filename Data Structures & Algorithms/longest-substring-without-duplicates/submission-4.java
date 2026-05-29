class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();

        int left = 0;
        int right = 0;

        int longestSubstring = 0;

        while(right < s.length()) {
            if(!seen.contains(s.charAt(right))) {
                seen.add(s.charAt(right));
                right++; 

                longestSubstring = Math.max(longestSubstring, seen.size());
            } else {
                seen.remove(s.charAt(left));
                left++;
            }
        }

        return longestSubstring;
    }
}
