class Solution {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length())
            return ans;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : p.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int matched = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (map.containsKey(ch)) {

                map.put(ch, map.get(ch) - 1);

                if (map.get(ch) >= 0)
                    matched++;
            }

            if (right - left + 1 > p.length()) {

                char remove = s.charAt(left);

                if (map.containsKey(remove)) {

                    if (map.get(remove) >= 0)
                        matched--;

                    map.put(remove, map.get(remove) + 1);
                }

                left++;
            }

            if (matched == p.length())
                ans.add(left);
        }

        return ans;
    }
}