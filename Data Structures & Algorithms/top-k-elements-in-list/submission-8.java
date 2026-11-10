class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : nums) {
            // Put it in the map if not there and then increment the value
            freq.putIfAbsent(num, 0);
            freq.put(num, freq.get(num) + 1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }

        List<Integer> results = new ArrayList<>();
        for(int i = buckets.length - 1; i > 0 && results.size() < k; i--) {
            for(int num : buckets[i]) {
                results.add(num);
            }
           
        }

        int[] output = new int[k];
        for(int i = 0; i < k; i++) {
            output[i] = results.get(i);
        }

        return output;
    }
}
