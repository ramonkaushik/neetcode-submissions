func hasDuplicate(nums []int) bool {
    // create map to keep track of nums we've seen
    containsDupe := make(map[int]bool)

    // iterate through nums
    for _, num := range nums {
        if containsDupe[num] {
            return true
        }
        containsDupe[num] = true
    }
    return false
}
