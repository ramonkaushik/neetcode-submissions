class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int heaviestStone, secondHeaviestStone;
        
        for(int stone : stones) {
            maxHeap.offer(stone);
        }

        while(maxHeap.size() > 1) {
            heaviestStone = maxHeap.poll();
            secondHeaviestStone = maxHeap.poll();

            maxHeap.offer(heaviestStone - secondHeaviestStone);
        }

        return maxHeap.peek();
    }
}
