class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;

        int[] count = new int[26];

        int maxf = 0;

        int output = 0;

        for(int right = 0; right < s.length(); right++) {
            int rightIndex = s.charAt(right) - 'A';

            count[rightIndex]++;
            maxf = Math.max(maxf, count[rightIndex]);

            while(right - left + 1 - maxf > k) {
                int leftIndex = s.charAt(left) - 'A';

                count[leftIndex]--;
                left++;
            }

            output = Math.max(output, right - left + 1);

        }

        return output;
    }
}
