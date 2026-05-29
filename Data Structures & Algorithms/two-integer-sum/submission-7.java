class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complementMap = new HashMap<>();
        int complement;

        for(int i = 0; i < nums.length; i++) {
            complement = target - nums[i];

            if(complementMap.containsKey(complement)) {
                return new int[] {complementMap.get(complement), i};
            }

            complementMap.put(nums[i], i);
        }

        return new int[] {0, 0};
    }
}