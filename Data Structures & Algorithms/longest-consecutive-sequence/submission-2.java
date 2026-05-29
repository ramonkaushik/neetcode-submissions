class Solution {
    public int longestConsecutive(int[] nums) {
        List<Integer> hashNums = new ArrayList<>();
        
        for(int num : nums) {
            hashNums.add(num);
        }

        int longestConsecutiveSequence = 0;

        int i = 0;
        while(i < nums.length) {
            // check if n - 1 exists
            // if not, iterate
            if(!hashNums.contains(nums[i] - 1)) {
                int localMaxSequence = 1;
                int num = nums[i];

                while(hashNums.contains(num + 1)) {
                    localMaxSequence++;
                    num++;
                }

                longestConsecutiveSequence = Math.max(longestConsecutiveSequence, localMaxSequence);
            }
            i++;
        }

        return longestConsecutiveSequence;
    }
}
