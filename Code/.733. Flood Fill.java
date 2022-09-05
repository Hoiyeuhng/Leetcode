class Solution {
    int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    int m;
    int n;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        m = image.length;
        n = image[0].length;
        dfs(image, sr, sc, color, image[sr][sc]);
        return image;
    }
    private void dfs(int[][] image, int i, int j, int color, int preColor) {
        if (i < 0 || i >= m || j < 0 || j >= n || image[i][j] != preColor || image[i][j] == color) {
            return;
        }
        image[i][j] = color;
        for (int[] dir : dirs) {
            dfs(image, i + dir[0], j + dir[1], color, preColor);
        }
    }
            
}