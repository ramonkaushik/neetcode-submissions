class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<>();
        helper(nums, target, output, 0, new ArrayList<>());
        return output;
    }

    private void helper(int[] nums, int target, List<List<Integer>> output, int index, List<Integer> curr) {
        if(target == 0) {
            output.add(new ArrayList<Integer>(curr));
        }
        else if(target < 0) {
            return;
        }

        for(int i = index; i < nums.length; i++) {
            curr.add(nums[i]);
            helper(nums, target - nums[i], output, i, curr);
            curr.remove(curr.size() - 1);
        }
    }
}
