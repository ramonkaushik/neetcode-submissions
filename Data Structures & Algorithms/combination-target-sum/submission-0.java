class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, output, target, 0, new ArrayList<Integer>());
        return output;
    }

    private void helper(int nums[], List<List<Integer>> output, int target, int index, List<Integer> curr) {
        if(target == 0) {
            output.add(new ArrayList(curr));
            return;
        }

        if(target < 0) {
            return;
        }

        for(int i = index; i < nums.length; i++) {
            curr.add(nums[i]);
            helper(nums, output, target - nums[i], i, curr);
            curr.remove(curr.size() - 1);
        }
    }
}
