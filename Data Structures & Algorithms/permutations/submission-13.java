class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        boolean[] boolMap = new boolean[nums.length];
        helper(nums, output, boolMap, new ArrayList());
        return output;
    }

    private void helper(int[] nums, List<List<Integer>> output, boolean[] boolMap, List<Integer> curr) {
        if(curr.size() == nums.length) {
            output.add(new ArrayList(curr));
        }

        for(int i = 0; i < nums.length; i++) {
            if(boolMap[i]) {
                continue;
            }

            curr.add(nums[i]);
            boolMap[i] = true;
            helper(nums, output, boolMap, curr);
            boolMap[i] = false;
            curr.remove(curr.size() - 1);
        }
    }
}
