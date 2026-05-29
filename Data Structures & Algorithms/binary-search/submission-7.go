func search(nums []int, target int) int {
    // Calculate middle, left, right
    lo := 0
    hi := len(nums) - 1

    // iterate 
    for lo <= hi {
        mid := (hi + lo) / 2
        // calculate limiting factors of 
        if nums[mid] == target {
            return mid
        } else if nums[mid] > target {
            // [1, 2, 3, 4, 5]
            hi = mid - 1
        } else if nums[mid] < target {
            lo = mid + 1
        }
    }
    return -1
}
