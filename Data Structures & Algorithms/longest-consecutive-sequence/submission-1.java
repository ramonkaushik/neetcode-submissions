class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) {
            return 0;
        }
        HashSet<Integer> nums2Hash = new HashSet<>();

        for(int num : nums) {
            nums2Hash.add(num);
        }

        int maxSequenceLength = 1;

        int i = 0;

        while(i < nums.length) {
            int localSequenceLength = 1;
            int num = nums[i];

            while(nums2Hash.contains(num + 1)) {
                localSequenceLength++; 

                maxSequenceLength = Math.max(maxSequenceLength, localSequenceLength);

                num++;
            }

            i++;
        }

        return maxSequenceLength;
    }
}
