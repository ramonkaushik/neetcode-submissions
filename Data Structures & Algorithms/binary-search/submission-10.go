func search(nums []int, target int) int {
	lo := 0
	hi := len(nums) - 1

	mid := 0

	for lo <= hi {
		mid = (lo + hi) / 2
		if target == nums[mid] {
			return mid;
		} else if nums[mid] > target {
			hi = mid - 1
		} else if nums[mid] < target {
			lo = mid + 1
		}
	}

	return -1;
}
