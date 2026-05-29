class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length() != s.length()) {
            return false;
        }

        final int SIZE_OF_ALPHABET = 26;
        int[] letterCounter = new int[SIZE_OF_ALPHABET];

        for(char c : s.toCharArray()) {
            letterCounter[c - 'a'] += 1;
        }

        for(char c : t.toCharArray()) {
            letterCounter[c - 'a'] -= 1;
        }

        for(int i : letterCounter) {
            if(i != 0) {
                return false;
            }
        }

        return true;
    }
}
