class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Step 1: find min and max
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return gcd(min, max);
    }

    
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}