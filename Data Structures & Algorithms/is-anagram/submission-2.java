class Solution {
    public boolean isAnagram(String s, String t) {
        // check that strings are the same length
        if(s.length() != t.length()) {
            return false;
        }

        // create integer array
        int[] alphabetCounter = new int[26];

        // loop through s and increment
        // loop through t and decrement
        for(int i = 0; i < s.length(); i++) {
            alphabetCounter[s.charAt(i) - 'a']++;
            alphabetCounter[t.charAt(i) - 'a']--;
        }
        // ensure only 0 exists in cells of integer array
        for(int i = 0; i < alphabetCounter.length; i++) {
            if(alphabetCounter[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
