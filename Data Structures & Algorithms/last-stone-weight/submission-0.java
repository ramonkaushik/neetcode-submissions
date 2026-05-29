class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> stoneWeight = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones) {
            stoneWeight.add(stone);
        }

        while(stoneWeight.size() > 1) {
            int heaviestStone = stoneWeight.poll();
            int secondHeaviestStone = stoneWeight.poll();

            stoneWeight.offer(heaviestStone - secondHeaviestStone);
        }

        return stoneWeight.poll();
    }
}
