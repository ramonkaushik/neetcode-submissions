class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // count the number of times we've seen each number
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : nums) {
            freq.putIfAbsent(num, 0);
            freq.put(num, freq.get(num) + 1);
        }

        // Create buckets where index is frequency and value is numbers of that freq
        List<Integer>[] buckets = new ArrayList[nums.length + 1];


        // Initialize buckets
        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }


        // add contents of top k bucklets ot result array. 
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }

        List<Integer> results = new ArrayList<>();
        for(int i = nums.length; i > 0 && results.size() < k; i--) {
            for(int num : buckets[i]) {
                results.add(num);
                if(results.size() == k) break;
            }
        }

        int[] output = new int[k];
        int i = 0;
        for(int result : results) {
            output[i] = result;
            i++;
        }

        return output;
    }
}
