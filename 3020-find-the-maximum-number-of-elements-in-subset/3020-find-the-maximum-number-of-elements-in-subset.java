class Solution {
    public int maximumLength(int[] nums) {

        HashMap<Long, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put((long) num, map.getOrDefault((long) num, 0) + 1);
        }

        int ans = 1;

        if (map.containsKey(1L)) {
            int count = map.get(1L);
            if (count % 2 == 0)
                count--;
            ans = Math.max(ans, count);
        }

        for (long num : map.keySet()) {

            if (num == 1)
                continue;

            long temp = num;
            int count = 0;

            while (map.getOrDefault(temp, 0) >= 2) {
                count += 2;
                temp *= temp;
            }

            if (map.getOrDefault(temp, 0) == 1)
                count++;
            else
                count--;

            ans = Math.max(ans, count);
        }

        return ans;
    }
}