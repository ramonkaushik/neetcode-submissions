func getConcatenation(nums []int) []int {
    // nums = [1, 2, 3]
    // ans [1, 2, 3, 1, 2, 3]

    // create an arr twice the size of nums
    ans := make([]int, len(nums) * 2)

    // fill up the ans array with contents of nums
    for i := 0; i < len(nums); i++ {
        ans[i] = nums[i]
    }

    // fill up remainder of array with the nums array again
    for i := len(nums); i < len(ans); i++ {
        ans[i] = nums[i - len(nums)]
    }

    return ans
}
