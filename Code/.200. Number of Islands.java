class Solution {
	int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int numIslands(char[][] grid) {
    	if (grid == null) {
    		return 0;
    	}
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		if (grid[i][j] == '1' ) {
        			count++;
        			dfs(grid, i, j);
        		}
        	}
        }
        return count;
    }
    private void dfs(char[][] grid, int i, int j) {
    	int m = grid.length;
    	int n = grid[0].length;
    	if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') {
    		return;
    	}
    	grid[i][j] = '0';
    	for (int[] dir : dirs) {
    		dfs(grid, i + dir[0], j + dir[1]);
    	}
    }
}