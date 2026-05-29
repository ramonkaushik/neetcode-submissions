class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;

        int maxf = 0;

        int[] seen = new int[26];

        int res = 0;

        for(int right = 0; right < s.length(); right++) {
            int rightIndex = s.charAt(right) - 'A';

            seen[rightIndex]++;
            maxf = Math.max(maxf, seen[rightIndex]);

            while(right - left + 1 - maxf > k) {
                int leftIndex = s.charAt(left) - 'A';

                seen[leftIndex]--;
                left++;
            }
            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}
