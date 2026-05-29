class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length == 0 || grid == null) {
            return 0;
        }

        int maxArea = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    maxArea = Math.max(dfs(grid, i, j), maxArea);
                }
            }
        }

        return maxArea;
    }

    private int dfs(int[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == 0) {
            return 0;
        }

        int localArea = 1;

        grid[i][j] = 0;

        localArea += dfs(grid, i + 1, j);
        localArea += dfs(grid, i - 1, j);
        localArea += dfs(grid, i, j + 1);
        localArea += dfs(grid, i, j - 1);

        return localArea;
    }
}
