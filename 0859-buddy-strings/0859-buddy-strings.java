class Solution {
    public boolean buddyStrings(String s, String goal) {
        int count = 0;
        int temp = 0;
        int i = 0;
        if ( s.length() != goal.length()) return false;
        if ( s.equals(goal))
        {
           HashMap< Character, Integer>  map = new HashMap<>();
           for ( char ch : goal.toCharArray())
           {
            map.put( ch, map.getOrDefault( ch, 0) + 1);
           }
           for ( int num : map.values())
           {
            if ( num > 1) return true;
           }
           return false;
        }
        char ch1 = ' ';
        char ch2 = ' ';
        while( i < s.length())
        {
            if ( count == 0)
            {
                if ( s.charAt(i) != goal.charAt(i))
                {
                    ch1 = s.charAt(i);
                    ch2 = goal.charAt(i);
                    count ++;
                    temp ++;
                    i ++;
                }
                else i ++;
            }
            else if( count == 1)
            {
                if ( s.charAt(i) != goal.charAt(i)) 
                {
                    if( ch1 == goal.charAt(i) && ch2 == s.charAt(i))
                    {
                        i ++;
                        temp --;
                    }
                    else return false;
                }
                else i ++;   
            }
            else return false;
        }
        return temp == 0;
    }
}