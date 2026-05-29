func twoSum(nums []int, target int) []int {
    complementMap := make(map[int]int)

    // iterating through nums to find complement
    for i, num := range nums {  
        complement := target - num
        
        _, ok := complementMap[complement]

        if ok {
            return []int {complementMap[complement], i}
        } 
        complementMap[num] = i
    }

    return []int {0, 0}
}
