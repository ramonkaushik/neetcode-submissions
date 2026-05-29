func twoSum(nums []int, target int) []int {
    // find complement and loop through array
    complementMap := make(map[int]int)

    for i, num := range(nums) {
        complement := target - num 
        val, ok := complementMap[complement]
        if ok {
            return []int {val, i}
        }
        complementMap[num] = i
    }
    return []int {0, 0}
}
