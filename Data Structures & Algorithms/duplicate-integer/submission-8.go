func hasDuplicate(nums []int) bool {
    // making a map. Gophers use struct{} to make a hashset.
    containsDupe := make(map[int]struct{})

    for _, num := range nums {
        _, exists := containsDupe[num]
        if exists {
            return true
        }
        containsDupe[num] = struct{}{}
    }
    return false
}
