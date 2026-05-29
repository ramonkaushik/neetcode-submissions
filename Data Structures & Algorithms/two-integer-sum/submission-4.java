class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> value2Index = new HashMap<Integer, Integer>();
        int complement;

        for(int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if(value2Index.containsKey(complement)) {
                return new int[] {value2Index.get(complement), i};
            }
            value2Index.put(nums[i], i);
        }
        return new int[] {0, 0};
    }
}
