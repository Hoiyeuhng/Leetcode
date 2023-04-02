import java.util.HashSet;
import java.util.Set;

class Solution {
    int[][] dirs = {{1,2},{1,-2},{-1,2},{-1,-2},{2,1},{2,-1},{-2,1},{-2,-1}};
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;
        Set<Integer> set = new HashSet<>();
        int[] max = {1};
        set.add(grid[0][0]);
        dfs(grid,set,0,0,max);
        return max[0]==(n-1)*(n-1);
    }
    public void dfs(int[][] grid, Set<Integer> set, int i, int j, int[] max) {
        int n = grid.length;
        if (max[0]==(n-1)*(n-1)){
            return;
        }
        for (int[] dir: dirs) {
            int newI = i + dir[0];
            int newJ = j + dir[1];
            if (newI < 0 || newI >= n || newJ < 0 || newJ >= n || set.contains(grid[newI][newJ])) {
                continue;
            }
            set.add(grid[newI][newJ]);
            max[0]=Math.max(set.size(),max[0]);
            dfs(grid,set,newI,newJ,max);
            set.remove(grid[newI][newJ]);
        }
    }
}