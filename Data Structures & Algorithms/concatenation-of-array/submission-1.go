func getConcatenation(nums []int) []int {
    ans := make([]int, len(nums) * 2)

    for i, num := range nums {
        ans[i] = num
    }

    for i := len(nums); i < len(ans); i++ {
        ans[i] = nums[i - len(nums)]
    }

    return ans
}
