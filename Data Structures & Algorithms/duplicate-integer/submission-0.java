class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> duplicateCheck = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(duplicateCheck.contains(nums[i])) {
                return true;
            }
            duplicateCheck.add(nums[i]);
        }
        return false;
    }
}
