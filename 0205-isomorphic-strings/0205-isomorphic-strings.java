class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap < Character, Character> map = new HashMap<>();
        for ( int i = 0; i < s.length(); i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if ( !map.containsKey(ch1))
            {
                if( !map.containsValue(ch2))
                {
                    map.put(ch1,ch2);
                }
                else return false;
            }
            else
            {
                char check = map.get(ch1);
                if( check != ch2 ) return false;
            }

        }
        return true;
        
    }
}