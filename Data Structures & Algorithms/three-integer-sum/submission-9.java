class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> output = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                int combo = nums[i] + nums[left] + nums[right];

                if(combo == 0) {
                    output.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                } else if(combo > 0) {
                    right--;
                } else if(combo < 0) {
                    left++;
                }
            }
        }

        return output;
    }
}
