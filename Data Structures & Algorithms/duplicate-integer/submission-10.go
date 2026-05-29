func hasDuplicate(nums []int) bool {
    dupes := make(map[int]bool)

    for _, val := range(nums) {
        if dupes[val] == true {
            return true
        }
        dupes[val] = true
    }

    return false
}
