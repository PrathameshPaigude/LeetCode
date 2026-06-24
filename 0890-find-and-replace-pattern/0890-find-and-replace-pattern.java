class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for ( int i = 0; i < words.length; i ++)
        {
            String str = words[i];
            if ( check( str, pattern)) ans.add(str);
        }
        return ans;
            
    }
    
    private boolean check ( String str, String pattern)
    {
         HashMap < Character, Character> map = new HashMap <>();
            for ( int j = 0; j < pattern.length(); j++)
            {
                char ch1 = pattern.charAt(j);
                char ch2 = str.charAt(j);
                if ( !map.containsKey(ch1))
                {
                    if(!map.containsValue(ch2))
                    {
                        map.put ( ch1, ch2);
                    }
                    else return false;
                }
                else 
                {
                    char chk = map.get(ch1);
                    if ( chk != ch2) return false;
                }
            }
            return true;
        }
    
}