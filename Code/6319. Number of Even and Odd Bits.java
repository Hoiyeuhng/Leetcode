class Solution {
    public int[] evenOddBit(int n) {
        String str = Integer.toBinaryString(n);
        int ns = str.length();
        int even=0;
        int odd=0;
        for (int i = 0; i < ns; i++){
            if (str.charAt(i)=='1') {
                if (i%2==0) {
                    even++;
                } else{
                    odd++;
                }
            }
        }
        if (ns%2==0){
            return new int[]{odd,even};
        }
        return new int[]{even,odd};
    }
}