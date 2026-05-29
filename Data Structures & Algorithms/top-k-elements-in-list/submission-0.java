class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Count the number of times we've seen the number
        HashMap<Integer, Integer> numberCounter = new HashMap<>();
        for(int num : nums) {
            numberCounter.putIfAbsent(num, 0);
            numberCounter.put(num, numberCounter.get(num) + 1);
        }

        // Create buckets where index is frequency and value is numbers of that frequency
        List<Integer>[] buckets = new ArrayList[nums.length + 1]; // buckets[frequency] = {values, ...}

        // Initialize buckets
        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : numberCounter.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }

        // add contents of top k buckets to result array
        List<Integer> results = new ArrayList<>();
        for(int i = buckets.length - 1; i >= 0 && results.size() < k; i--) {
            for(int num : buckets[i]) {
                results.add(num);
                if(results.size() == k) break;
            }
        }

        int[] output = new int[k];
        for(int i = 0; i < output.length; i++) {
            output[i] = results.get(i);
        }

        return output;
    }
}
