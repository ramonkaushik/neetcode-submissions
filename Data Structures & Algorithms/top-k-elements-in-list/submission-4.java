class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyCounter = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            frequencyCounter.putIfAbsent(nums[i], 0);
            frequencyCounter.put(nums[i], frequencyCounter.get(nums[i]) + 1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        for(Map.Entry<Integer, Integer> entry : frequencyCounter.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey()); 
        }

        List<Integer> listOutput = new ArrayList<>();
        
        for(int i = buckets.length - 1; i >= 0; i--) {
            // add top k frequent elems to listOutput and if size == k then break()
            for(int bucketElem : buckets[i]) {
                listOutput.add(bucketElem);
                if(listOutput.size() == k) {
                    break;
                }
            }

            if(listOutput.size() == k) {
                break;
            }
        }

        int[] output = new int[k];
        for(int i = 0; i < output.length; i++) {
            output[i] = listOutput.get(i);
        }

        return output;
    }
}
