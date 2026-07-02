func maxArea(heights []int) int {
    left := 0
    right := len(heights) - 1

    maxArea := 0

    for left < right {
        width := right - left
        length := min(heights[left], heights[right])

        localArea := length * width

        maxArea = max(localArea, maxArea)

        if heights[left] >= heights[right] {
            right--
        } else {
            left++
        }
    }

    return maxArea;
}
