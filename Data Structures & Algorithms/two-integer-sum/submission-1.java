class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Declare map to hold previously seen numbers and their index.
        HashMap<Integer, Integer> previousNumbers = new HashMap<Integer, Integer>();

        // loop through nums, declaring a complement to current num[i]
        int complement;        
        for(int i = 0; i < nums.length; i++) {
            // if we find the complement to be a 'previousNumber' -> return it
            complement = target - nums[i];
            if(previousNumbers.containsKey(complement)) {
                return new int[] {previousNumbers.get(complement), i};
            }
            previousNumbers.put(nums[i], i);
        }
        return new int[] {0, 0};
    }
}
