class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashNums = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            hashNums.add(nums[i]);
        }

        int longestSeq = 0;

        int i = 0;
        while(i < nums.length) {
            int num = nums[i];
            if(!hashNums.contains(num - 1)) {
                int localSeq = 1;
                while(hashNums.contains(num + 1)) {
                    localSeq++;
                    num++;
                }
                longestSeq = Math.max(longestSeq, localSeq);
            }
            i++;
        }
        return longestSeq; 
    }
}
