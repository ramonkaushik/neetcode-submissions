func twoSum(nums []int, target int) []int {
    // hashmap of nums and its complement to reach target
    complementMap := make(map[int]int)

    // iterate through the array of nums
    for i, num := range nums {
        // store this as a num's value in map
        complement := target - num
        
        // check if key exists in map
        _, ok := complementMap[complement] 
        if ok {
            return []int {complementMap[complement], i}
        }
        complementMap[num] = i
    }

    return []int {0, 0}
}
