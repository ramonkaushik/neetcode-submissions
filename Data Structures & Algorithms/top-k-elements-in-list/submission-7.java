class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : nums) {
            freq.putIfAbsent(num, 0);
            freq.put(num, freq.get(num) + 1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        // add number to its respective freq
        for(Map.Entry<Integer, Integer>  entry : freq.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }

        List<Integer> results = new ArrayList<>();
        for(int i = buckets.length - 1; i >= 0 && results.size() < k; i--) {
            for(int num : buckets[i]) {
                results.add(num);
                if(results.size() == k) break;
            }
        }

        int[] output = new int[k];
        int i = 0;
        for(int num : results) {
            output[i] = num;
            i++;
        }
        return output;
    }
}
