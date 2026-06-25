class Solution {
    public boolean rotateString(String s, String goal) {
        if ( s.length() != goal.length()) return false;

        String chk = s + s;
        return chk.contains(goal);
    }
}