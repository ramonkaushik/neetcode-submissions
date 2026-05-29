class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, nums, 0, new ArrayList<>());
        return result;
    }

    private void helper(List<List<Integer>> result, int[] nums, int index, List<Integer> curr) {
        result.add(new ArrayList<Integer>(curr));

        for(int i = index; i < nums.length; i++) {
            curr.add(nums[i]);
            helper(result, nums, i + 1, curr);
            curr.remove(curr.size() - 1);
        }
    }
}
