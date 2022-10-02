class Solution {
    public int minimizeXor(int num1, int num2) {
        int count = Integer.bitCount(num2);
        int n1 = Integer.bitCount(num1);
        int ans = num1;
        if (count == n1) {
            return num1;
        } else if (count > n1) {
            count = count - n1;
            for (int i = 0; i < 32; i++) {
                if ((num1 & (1 << i)) == 0 && count > 0) {
                    ans += 1 << i;
                    count--;
                }
            }
        } else {
            count = n1 - count;
            for (int i = 0; i < 32; i++) {
                if ((num1 & (1 << i)) > 0 && count > 0) {
                    ans -= 1 << i;
                    count--;
                }
            }
        }
        return ans;
    }
}