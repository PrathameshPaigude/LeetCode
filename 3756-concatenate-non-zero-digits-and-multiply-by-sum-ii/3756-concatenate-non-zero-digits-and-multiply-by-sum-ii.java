class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int[] ans = new int[queries.length];
        int count = 0;

        long mod = 1_000_000_007L;
        int n = s.length();

        long[] prefixNum = new long[n + 1];
        long[] prefixSum = new long[n + 1];
        int[] nonZeroCount = new int[n + 1];
        long[] power = new long[n + 1];

        power[0] = 1;

        for (int i = 1; i <= n; i++) {
            power[i] = (power[i - 1] * 10) % mod;
        }

        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';

            prefixNum[i + 1] = prefixNum[i];
            prefixSum[i + 1] = prefixSum[i];
            nonZeroCount[i + 1] = nonZeroCount[i];

            if (digit != 0) {
                prefixNum[i + 1] =
                    (prefixNum[i] * 10 + digit) % mod;

                prefixSum[i + 1] =
                    prefixSum[i] + digit;

                nonZeroCount[i + 1]++;
            }
        }

        for (int[] num : queries) {
            int l = num[0];
            int r = num[1];

            int digits = nonZeroCount[r + 1] - nonZeroCount[l];

            long x = (
                prefixNum[r + 1]
                - (prefixNum[l] * power[digits]) % mod
                + mod
            ) % mod;

            long sum =
                prefixSum[r + 1] - prefixSum[l];

            ans[count] = (int) ((x * sum) % mod);
            count++;
        }

        return ans;
    }
}