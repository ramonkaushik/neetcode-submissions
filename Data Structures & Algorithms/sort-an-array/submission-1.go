func sortArray(nums []int) []int {
    // edge case: we want to handle arrays bigger than 1
    if len(nums) <= 1 {
        return nums
    }

    // split the arrays in half and recurse on them
    mid := len(nums) / 2
    left := sortArray(nums[:mid])
    right := sortArray(nums[mid:])

    return merge(left, right)
}

func merge(left []int, right []int) []int {
    // create a new slice based on total length of input slices
    mergedSlice := make([]int, len(left) + len(right))

    // declare pointers for left and right
    i := 0
    j := 0

    for k := 0; k < len(mergedSlice); k++ {
        // left list exhausted
        if i >= len(left) {
            mergedSlice[k] = right[j]
            j++
        } else if j >= len(right) { // right list exhausted
            mergedSlice[k] = left[i]
            i++
        } else if left[i] < right[j] { // left is smaller than right
            mergedSlice[k] = left[i]
            i++
        } else { // right is smaller or they're equal
            mergedSlice[k] = right[j]
            j++
        }
    }

    return mergedSlice
}