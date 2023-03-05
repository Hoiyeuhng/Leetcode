class Solution {
    public int passThePillow(int n, int time) {
        int index = 1;
        int rev = -1;
        for (int i = 0; i < time; i++) {
            if (index == 1 || index == n) {
                rev = rev * -1;
            }
            index += 1 * rev;
        }
        return index;

    }
}