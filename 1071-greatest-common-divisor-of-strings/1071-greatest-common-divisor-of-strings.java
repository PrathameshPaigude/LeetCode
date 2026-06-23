class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if ( !(str1 + str2).equals(str2 + str1)) return "";
        int a = Math.max(str1.length(), str2.length());
        int b = Math.min(str1.length(), str2.length());
        while ( b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return str1.substring(0, a);
        
    }
}