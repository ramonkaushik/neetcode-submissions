class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList();
        boolean[] boolMap = new boolean[nums.length];
        helper(nums, output, new ArrayList(), boolMap);
        return output;
    }

    private void helper(int[] nums, List<List<Integer>> output, List<Integer> curr, boolean[] boolMap) {
        if(nums.length == curr.size()) {
                output.add(new ArrayList(curr));
            }

        for(int i = 0; i < nums.length; i++) { 
            if(boolMap[i] == true) {
                continue;
            }

            curr.add(nums[i]);
            boolMap[i] = true;
            helper(nums, output, curr, boolMap);
            boolMap[i] = false;
            curr.remove(curr.size() - 1);
        }
    }
}
