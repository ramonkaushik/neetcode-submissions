class Solution {
    public boolean isAnagram(String s, String t) {
        int[] letterCounter = new int[26];

        for(int i = 0; i < s.length(); i++) {
            letterCounter[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < t.length(); i++) {
            letterCounter[t.charAt(i) - 'a']--;
        }

        for(int count : letterCounter) {
            if(count != 0) {
                return false;
            }
        }
        return true;
    }
}
