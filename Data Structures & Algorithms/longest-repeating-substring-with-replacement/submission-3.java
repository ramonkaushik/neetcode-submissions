class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;

        int maxf = 0;

        int[] alphabet = new int[26];

        int maxWindow = 0;

        for(int right = 0; right < s.length(); right++) {
            // incrementing curr char freq
            alphabet[s.charAt(right) - 'A']++;
            
            // seeing if cur char is max freq
            maxf = Math.max(maxf, alphabet[s.charAt(right) - 'A']);

            // if the size of the sliding window cannot be added to, move left pointer
            while(right - left + 1 - maxf > k) {
                // decrement freq 
                alphabet[s.charAt(left) - 'A']--;
                
                left++;
            }

            // is the current window bigger than the previous max window?
            maxWindow = Math.max(maxWindow, right - left + 1);
        }

        return maxWindow;
    }
}
