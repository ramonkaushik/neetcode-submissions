/**
 * Definition of Interval:
 * type Interval struct {
 *    start int
 *    end   int
 * }
 */

func canAttendMeetings(intervals []Interval) bool {
	sort.Slice(intervals, func(a, b int) bool {
		return intervals[a].start < intervals[b].start
	})

	// [1, 2] [1, 4]
	for i := 1; i < len(intervals); i++ {
		if intervals[i - 1].end > intervals[i].start {
			return false
		}
	}

	return true

}
