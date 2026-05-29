class Solution {
    public int[] twoSum(int[] nums, int target) {
        int complement;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            complement = target - nums[i];

            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            // if doesn't exist in the map, add it to the map
            map.put(nums[i], i);
        }

        return new int[] {0, 0};
    }
}
