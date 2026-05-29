class Solution {
    public List<List<Integer>> permute(int[] nums) {
        // Permutations are about order

        List<List<Integer>> output = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        helper(output, nums, used, new ArrayList<Integer>());
        return output;
    }

    private void helper(List<List<Integer>> output, int[] nums, boolean[] used, List<Integer> curr) {
        if(nums.length == curr.size()) {
            output.add(new ArrayList<Integer>(curr));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(used[i]) {
                continue;
            }
            
            curr.add(nums[i]);
            used[i] = true;
            helper(output, nums, used, curr);
            used[i] = false;
            curr.remove(curr.size() - 1);
        }
    }
}
