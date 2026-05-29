class Solution {
    public int search(int[] nums, int target) {
        int lo = 0; 
        int hi = nums.length - 1;
        int mid;

        for(int i = 0; i < nums.length; i++) {
            mid = (hi + lo) / 2;

            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                lo = mid + 1;
            }
            else if(nums[mid] > target) {
                hi = mid - 1;
            }
        }

        return -1;
    }
}
