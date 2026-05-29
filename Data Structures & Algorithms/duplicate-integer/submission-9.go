func hasDuplicate(nums []int) bool {
    dupes := make(map[int]struct{}) 

    for _, num := range(nums) {
        _, exists := dupes[num]
        if exists {
            return true
        }
        dupes[num] = struct{}{}
    }

    return false
}
