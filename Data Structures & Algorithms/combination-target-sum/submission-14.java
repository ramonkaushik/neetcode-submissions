class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<>();
        helper(nums, target, 0, new ArrayList(), output);
        return output;
    }

    private void helper(int[] nums, int target, int index, List<Integer> curr, List<List<Integer>> output) {
        if(target == 0) {
            output.add(new ArrayList<Integer>(curr));
        }
        else if(target < 0) {
            return;
        }
        
        for(int i = index; i < nums.length; i++) {
            curr.add(nums[i]);
            helper(nums, target - nums[i], i, curr, output);
            curr.remove(curr.size() - 1);
        }
    }
}
