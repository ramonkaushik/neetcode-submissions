class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        helper(nums, output, new ArrayList(), used);
        return output;
    }

    private void helper(int[] nums, List<List<Integer>> output, List<Integer> curr, boolean[] used) {
        if(curr.size() == nums.length) {
            output.add(new ArrayList(curr));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(used[i]) {
                continue;
            }
            
            curr.add(nums[i]);
            used[i] = true;
            helper(nums, output, curr, used);
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}
