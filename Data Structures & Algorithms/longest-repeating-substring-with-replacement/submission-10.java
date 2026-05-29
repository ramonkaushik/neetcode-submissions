class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;

        int res = 0;

        int[] charFreq = new int[26];

        int maxf = 0;

        for(int right = 0; right < s.length(); right++) {
            int rightIndex = s.charAt(right) - 'A';
            
            charFreq[rightIndex]++;
            maxf = Math.max(maxf, charFreq[rightIndex]);

            while(right - left + 1 - maxf > k) {
                int leftIndex = s.charAt(left) - 'A';
                
                charFreq[leftIndex]--;
                left++;
            }

            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
