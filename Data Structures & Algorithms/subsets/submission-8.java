class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        helper(nums, 0, output, new ArrayList());
        return output;
    }

    private void helper(int[] nums, int index, List<List<Integer>> output, List<Integer> curr) {
        output.add(new ArrayList<Integer>(curr));
        for(int i = index; i < nums.length; i++) {
            curr.add(nums[i]);
            helper(nums, i + 1, output, curr);
            curr.remove(curr.size() - 1);
        }
    }
}
