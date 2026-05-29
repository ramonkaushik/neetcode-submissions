class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        helper(nums, subsets, 0, new ArrayList<Integer>());
        return subsets;
    }

    private void helper(int[] nums, List<List<Integer>> subsets, int index, List<Integer> curr) {
        subsets.add(new ArrayList<Integer>(curr));

        for(int i = index; i < nums.length; i++) {
            curr.add(nums[i]);
            helper(nums, subsets, i + 1, curr);
            curr.remove(curr.size() - 1);
        }
    }
}
