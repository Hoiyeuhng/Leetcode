class Solution {
    public int maxSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i + 1 <= n - 1; i++) {
            for (int j = 1; j + 1 <= m - 1; j++) {
                max = Math.max(max, f(i,j,grid));
            }
        }
        return max;
    }
    private int f(int i, int j, int[][] grid) {
        return grid[i][j] + grid[i - 1][j - 1] + grid[i - 1][j] + grid[i- 1][j + 1] + grid[i + 1][j - 1] + grid[i + 1][j] + grid[i + 1][j + 1];
    }
}