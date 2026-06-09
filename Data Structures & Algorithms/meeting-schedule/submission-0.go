/**
 * Definition of Interval:
 * type Interval struct {
 *    start int
 *    end   int
 * }
 */

 // [1,2] [1,3] overlap
 // [1,2] [2,4] non overlap

func canAttendMeetings(intervals []Interval) bool {
	// sort
	sort.Slice(intervals, func(i, j int) bool {
		return intervals[i].start < intervals[j].start
	})
	
	// compare start and end times
	// [0,30] [5,10]
	for i := 1; i < len(intervals); i++ {
		if intervals[i - 1].end > intervals[i].start {
			return false
		}
	}

	return true

}
