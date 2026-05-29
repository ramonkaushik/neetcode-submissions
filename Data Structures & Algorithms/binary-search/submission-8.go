func search(nums []int, target int) int {
    // declare hi and lo vars
    lo := 0
    hi := len(nums) - 1

    // iterate through nums.
    for lo <= hi {
        mid := (hi + lo) / 2

        if target == nums[mid] {
            return mid
        } else if target > nums[mid] {
            // [1, 2, 3, 4, 5]
            lo = mid + 1
        } else if target < nums[mid] {
            hi = mid - 1
        }
    }


    return -1
}
