class Solution {
    public boolean halvesAreAlike(String s) {

        int indx = 0;
        int count = 0;

        while (indx < s.length() / 2) {

            char a = Character.toLowerCase(s.charAt(indx));
            char b = Character.toLowerCase(s.charAt(s.length() - indx - 1));

            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')
                count++;

            if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u')
                count--;

            indx++;
        }

        return count == 0;
    }
}