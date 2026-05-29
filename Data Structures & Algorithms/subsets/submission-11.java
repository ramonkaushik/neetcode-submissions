class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        helper(output, nums, 0, new ArrayList<>());
        return output;
    }

    private void helper(List<List<Integer>> output, int[] nums, int index, List<Integer> curr) {
        output.add(new ArrayList(curr));
        for(int i = index; i < nums.length; i++) {
            curr.add(nums[i]);
            helper(output, nums, i + 1, curr);
            curr.remove(curr.size() - 1);
        }
    }
}
