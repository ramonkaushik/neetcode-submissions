class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        helper(nums, output, used, new ArrayList());
        return output;
    }

    private void helper(int[] nums, List<List<Integer>> output, boolean[] used, List<Integer> curr) {
        if(used.length == curr.size()) {
            output.add(new ArrayList(curr));
        }

        for(int i = 0; i < used.length; i++) {
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
