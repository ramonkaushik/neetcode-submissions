class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] cars = new double[position.length][2];

        for(int i = 0; i < cars.length; i++) {
            for(int j = 0; j < cars[i].length; j++) {
                cars[i][0] = position[i];
                cars[i][1] = (double) (target - position[i]) / speed[i];
            }
        }

        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        Stack<Double> stack = new Stack<>();

        for(double[] car : cars) {
            if(stack.empty() || car[1] > stack.peek()) {
                stack.push(car[1]);
            }
        }

        return stack.size();
    }
}
