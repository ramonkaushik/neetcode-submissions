class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        helper(nums, output, used, new ArrayList());
        return output;
    }

    private void helper(int[] nums, List<List<Integer>> output, boolean[] used, List<Integer> curr) {
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
            helper(nums, output, used, curr);
            used[i] = false;
            curr.remove(curr.size() - 1);
        }
    }
}
