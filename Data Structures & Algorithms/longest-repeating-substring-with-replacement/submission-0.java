class Solution {
    public int characterReplacement(String s, int k) {
        // declare hashmap that keeps characters : frequency
        int[] seen = new int[26];

        // declare result (longest window found)
        int res = 0;

        // declare left pointer 
        int left = 0;

        // declare maxFreq (highest frequency character in current window)
        int maxf = 0;

        // iterate through string with right pointer
        for(int right = 0; right < s.length(); right++) {
            // add/update frequency of right character in map
            seen[s.charAt(right) - 'A']++;

            // update maxFreq with the frequency of right character
            maxf = Math.max(maxf, seen[s.charAt(right) - 'A']);

            // while (windowSize - maxFreq) > k
            while((right - left + 1) - maxf > k) {
                // decrease frequency of left character in map
                seen[s.charAt(left) - 'A']--;
                
                // increment left
                left++;
            }

            // update result with current window size (right - left + 1)
            res = Math.max(res, right - left + 1);
            
        }
        return res;
    }
}
