func hasDuplicate(nums []int) bool {
    containsDupe := make(map[int]bool)

    for _, num := range nums {
        _, exists := containsDupe[num]
        if exists {
            return true
        }
        containsDupe[num] = true
    }
    return false
}
