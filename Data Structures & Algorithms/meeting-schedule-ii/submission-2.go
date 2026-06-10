/**
 * Definition of Interval:
 * type Interval struct {
 *    start int
 *    end   int
 * }
 */

func minMeetingRooms(intervals []Interval) int {
	// create start and end slices
	startSlice := []int{}
	endSlice := []int{}
	
	// add start and end times to slice
	for _, interval := range intervals {
		startSlice = append(startSlice, interval.start)
		endSlice = append(endSlice, interval.end)
	}


	// sort
	sort.Ints(startSlice)
	sort.Ints(endSlice)

	// declare pointers and counter
	start, end := 0, 0
	counter := 0

	// incrementing over startSlice
	for start < len(startSlice) {
		// if the start time is less than the end time, count up. 
		if startSlice[start] < endSlice[end] {
			counter++
		} else {
			// else move the right pointer
			end++
		}
		start++
	}

	return counter
}
