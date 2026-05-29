class Solution {
    public int numIslands(char[][] grid) {
        // get rid of edge cases immediately
        if(grid == null || grid.length == 0) {
            return 0;
        }

        // declare output var
        int numberOfIslands = 0;

        // loop through matrix and count islands recursively
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                numberOfIslands += dfs(grid, i, j);
            }
        }
        return numberOfIslands;
    }

    private int dfs(char[][] grid, int i, int j) {
        // get rid of base cases
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return 0;
        }

        // mark current island as zero
        grid[i][j] = '0';

        // recursively iterate through subproblems left. 
        dfs(grid, i + 1, j); // right
        dfs(grid, i - 1, j); // left
        dfs(grid, i, j + 1); // up
        dfs(grid, i, j - 1); // down

        return 1;
    }
}
