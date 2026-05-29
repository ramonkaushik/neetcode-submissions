class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> output = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int a_pointer = i + 1;
            int b_pointer = nums.length - 1;

            while(a_pointer < b_pointer) {
                int combo = nums[i] + nums[a_pointer] + nums[b_pointer];

                if(combo == 0) {
                    output.add(Arrays.asList(nums[i], nums[a_pointer], nums[b_pointer]));

                    a_pointer++;
                    b_pointer--;

                    while(a_pointer < b_pointer && nums[a_pointer] == nums[a_pointer - 1]) {
                        a_pointer++;
                    } 
                } else if(combo > 0) {
                    b_pointer--;
                } else if(combo < 0) {
                    a_pointer++;
                }
            }
        }
        return output;
    }
}
