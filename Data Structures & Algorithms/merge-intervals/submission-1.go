func merge(intervals [][]int) [][]int {
    sort.Slice(intervals, func(i, j int) bool {
		return intervals[i][0] < intervals[j][0]
	})

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
