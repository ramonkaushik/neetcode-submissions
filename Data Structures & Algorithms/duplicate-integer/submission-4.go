func hasDuplicate(nums []int) bool {
    containsDupes := make(map[int]bool)
    
    for _, num := range nums {
        if containsDupes[num] {
            return true
        }
        containsDupes[num] = true
        
    }
    return false

}
