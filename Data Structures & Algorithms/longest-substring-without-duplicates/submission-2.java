class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();

        int a_pointer = 0;
        int b_pointer = 0;

        int max = 0;

        while(b_pointer < s.length()) {
            if(!seen.contains(s.charAt(b_pointer))) {
                seen.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(seen.size(), max);
            } else {
                seen.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }

        return max;
    }
}
