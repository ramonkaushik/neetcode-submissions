func sortArray(nums []int) []int {
    // if the length is <= 1, do something
    if len(nums) <= 1 {
        return nums
    }

    // declare left, and right arrays with midpoint
    mid := len(nums) / 2
    left := sortArray(nums[:mid])
    right := sortArray(nums[mid:])

    // return merge() of left and right arrays
    return merge(left, right)
}

func merge(left []int, right []int) []int {
    // make a slice of appropriate size
    mergedArray := make([]int, len(left) + len(right))

    // declare first 2 pointers
    i := 0
    j := 0
    
    // iterate with third pointer to sort
    for k := 0; k < len(mergedArray); k++ {
        if i >= len(left) { // left array exausted
            mergedArray[k] = right[j]
            j++
        } else if j >= len(right) { // right array exausted
            mergedArray[k] = left[i]
            i++
        } else if left[i] < right[j] { // left[i] is less than right[j]
            mergedArray[k] = left[i]
            i++
        } else {
            mergedArray[k] = right[j]
            j++
        }
    }

    return mergedArray
        




}

