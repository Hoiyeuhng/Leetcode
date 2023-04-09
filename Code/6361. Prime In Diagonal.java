import java.util.Arrays;

class Solution {
    public int diagonalPrime(int[][] nums) {
        int max = nums[0][0];
        int n = nums.length;
        int m = nums[0].length;
        for (int i = 0; i < Math.min(n,m); i++) {
            max = Math.max(max, nums[i][i]);
        }
        for (int i = 0; i < Math.max(n,m); i++ ) {
            if (nums.length - i - 1 > m - 1) {
                continue;
            }
            if (i > n - 1 || nums.length - i - 1 < 0) {
                break;
            }
            max = Math.max(max, nums[i][nums.length - i - 1]);
        }
        boolean[] primes = new boolean[max + 2];
        Arrays.fill(primes, true);
        primes[1] = false;
        for (int i = 2; i <= max + 1; i++) {
            if (!primes[i]) {
                continue;
            }
            for (int j = 2; j * i <= max + 1; j++) {
                primes[j * i] = false;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (primes[nums[i][i]]) {
                ans = Math.max(ans, nums[i][i]);
            }
            
        }
        for (int i = 0; i < n; i++ ) {
            if (primes[nums[i][nums.length - i - 1]]){
                ans = Math.max(ans, nums[i][nums.length - i - 1]);
            }
            
        }
        return ans;
    }
}