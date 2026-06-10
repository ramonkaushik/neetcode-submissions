func merge(intervals [][]int) [][]int {
    // 1. sort the intervals based on start time
	sort.Slice(intervals, func(i, j int) bool {
		return intervals[i][0] < intervals[j][0]
	})

	// 2. if lp.end >= rp.start absorb and add to new interval list, else increment
	// [1,3] [1,5] absorb
	// [1,3] [4,5] move on
	output := [][]int{intervals[0]}

	for i := 1; i < len(intervals); i++ {
		lastOutput := output[len(output) - 1]
		currInterval := intervals[i]

		if lastOutput[1] >= currInterval[0] {
			lastOutput[1] = max(lastOutput[1], currInterval[1])
		} else {
			output = append(output, currInterval)
		}
	}

	return output
}
