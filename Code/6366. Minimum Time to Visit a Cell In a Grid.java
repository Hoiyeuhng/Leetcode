import java.util.*;
class Solution {
    int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int minimumTime(int[][] grid) {
        //TLE
        int m = grid.length;
        int n = grid[0].length;
        PriorityQueue<Integer[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[2], b[2]));
        pq.add(new Integer[]{0,0,0});
        while (pq.size() != 0) {
            Integer[] cur = pq.poll();
            if (cur[0] == m - 1 && cur[1] == n - 1) {
                return cur[2];
            }
            for (int[] dir : dirs) {
                int newI = cur[0] + dir[0];
                int newJ = cur[1] + dir[1];
                if (newI >= 0 && newI < m && newJ >= 0 && newJ < n && cur[2] + 1 >= grid[newI][newJ]) {
                    pq.add(new Integer[] {newI, newJ, cur[2] + 1});
                }
            }
        }
        return -1;
    }
}