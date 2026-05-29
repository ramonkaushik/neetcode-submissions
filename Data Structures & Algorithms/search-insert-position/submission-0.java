class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        int mid;

        // test case:
        // [0, 1, 2, 3, 4], target == 3

        while(lo <= hi) {
            mid = (lo + hi) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] > target) {
                hi = mid - 1; 
            }
            else if(nums[mid] < target) {
                lo = mid + 1;
            }
        }

        return hi + 1;

    }
}