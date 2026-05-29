class Solution {
    public int removeDuplicates(int[] nums) {
        // [1, 2, 3, 3]
        int putNextUniqueNum = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                nums[putNextUniqueNum] = nums[i];
                putNextUniqueNum++;
            }
        }
        return putNextUniqueNum;
    }
}