class Solution {
    public int subtractProductAndSum(int n) {
        int m = 0;
        int a = 1;
        int Digit = 0;

        while(n != 0)
        {
          Digit = n % 10;
            a = a * Digit;
            m = m + Digit;

            n = n / 10;
        }
        
        int ans = a - m;

        return ans;

    }
}