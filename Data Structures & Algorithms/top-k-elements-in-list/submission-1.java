class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> intCounter = new HashMap<>();

        for(int num : nums) {
            intCounter.putIfAbsent(num, 0);
            intCounter.put(num, intCounter.get(num) + 1);
        }

        List<Integer>[] bucketSort = new ArrayList[nums.length + 1];

        for(int i = 0; i < bucketSort.length; i++) {
            bucketSort[i] = new ArrayList<Integer>();
        }

        // bucketSort[<frequency>] = {list of nums}
        for(Map.Entry<Integer, Integer> entry : intCounter.entrySet()) {
            bucketSort[entry.getValue()].add(entry.getKey());
        }

        List<Integer> output = new ArrayList<>();
        for(int i = bucketSort.length - 1; i >= 0; i--) {
            // add the elem to output list
            for(int elem : bucketSort[i]) {
                output.add(elem);

                if(output.size() == k) {
                    int[] output2Array = new int[k];
                    for(int j = 0; j < output2Array.length; j++) {
                        output2Array[j] = output.get(j);
                    }
                    return output2Array;
                }
            } 
        } 

        int[] output2Array = new int[k];
        for(int j = 0; j < output2Array.length; j++) {
            output2Array[j] = output.get(j);
        }
        return output2Array;
    }
}
