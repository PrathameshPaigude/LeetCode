class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap < Character, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for ( char ch : s.toCharArray())
        {
            if( ch != ' ')
            {
                word.append(ch);
            }
            else
            {
                if(word.length() != 0) list.add(word.toString());
                word.setLength(0);
            }
        }
        if ( word.length() != 0) list.add(word.toString());
        if ( list.size() != pattern.length()) return false;
        for ( int i = 0; i < list.size(); i++)
        {   
            char ch = pattern.charAt(i);
            String str = list.get(i);
            if ( !map.containsKey(ch))
            {
                if( !map.containsValue(str))
                {
                    map.put( ch, str);
                }
                else return false;
            }
            else
            {
                String str2 = map.get(ch);
                if( !str2.equals(str)) return false;
            }
        }

        return true;
    }
}