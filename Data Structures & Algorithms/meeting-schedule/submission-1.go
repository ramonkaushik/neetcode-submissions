/**
 * Definition of Interval:
 * type Interval struct {
 *    start int
 *    end   int
 * }
 */

func canAttendMeetings(intervals []Interval) bool {
	// 1. sort intervals based on start value
	sort.Slice(intervals, func(i int, j int) bool {
		return intervals[i].start < intervals[j].start
	})

	// 2. compare end of i - 1 to start of i 
	for i := 1; i < len(intervals); i++ {
		// [0, 20] [10, 15]
		if intervals[i - 1].end > intervals[i].start {
			return false;
		}
	}

	return true
}
