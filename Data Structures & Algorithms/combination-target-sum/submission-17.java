class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, target, result, 0, new ArrayList());
        return result;
    }

    private void helper(int[] nums, int target, List<List<Integer>> result, int index, List<Integer> curr) {
        if(target == 0) {
            result.add(new ArrayList(curr));
        }
        else if(target < 0){
            return;
        }

        for(int i = index; i < nums.length; i++) {
            curr.add(nums[i]);
            helper(nums, target - nums[i], result, i, curr);
            curr.remove(curr.size() - 1);
        }
    }
}
