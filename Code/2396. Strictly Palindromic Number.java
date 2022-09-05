class Solution {
    public boolean isStrictlyPalindromic(int n) {
      for (int i = 2; i <= n - 2; i++) {
        if (! isP(toBase(n, i))) {
          return false;
        }
      }
  
      return true;
    }
    private String toBase(int n, int b) {
      return Integer.toString(n, b);
    }
    private boolean isP(String s) {
      int left = 0;
      int right = s.length() - 1;
      while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
          return false;
        }
        left++;
        right--;
      }
      return true;
    }
    public boolean isStrictlyPalindromic2(int n) {
        return false;
    }
  }