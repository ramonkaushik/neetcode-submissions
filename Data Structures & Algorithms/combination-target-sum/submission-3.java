class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<>();
        helper(nums, target, output, new ArrayList<>(), 0);
        return output;
    }

    private void helper(int[] nums, int target, List<List<Integer>> output, List<Integer> curr, int index) {
        if(target == 0) {
            output.add(new ArrayList(curr));
            return;
        }
        else if(target < 0) {
            return;
        } 
        
        for(int i = index; i < nums.length; i++) {
            curr.add(nums[i]);
            helper(nums, target - nums[i], output, curr, i);
            curr.remove(curr.size() - 1);
        }
    }
}
