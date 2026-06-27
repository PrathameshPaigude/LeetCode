class Solution {
    public List<String> commonChars(String[] words) {
        int[] freq1 = new int [26];
        for( char ch : words[0].toCharArray()) freq1[ ch - 'a'] ++;
        for ( String str : words)
        {
            int[] freq2 = new int [26];
            for ( char ch : str.toCharArray())
            {
                freq2[ ch - 'a'] ++;
            }
            for ( int i = 0; i < 26; i ++)
            {
                freq1[i] = Math.min( freq1[i], freq2[i]);
            }
        }
        List<String> ans = new ArrayList<>();
        for( int i = 0; i < 26; i ++)
        {
            while( freq1[i] > 0)
            {
                char ch = (char)(i + 'a');
                ans.add("" + ch);
                freq1[i] --;
            }
        }        
        return ans;
    }
}