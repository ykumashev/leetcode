class Solution {
    public void reverseString(char[] s) {
        helper(0, s.length-1, s);
    }

    public void helper(int start, int end, char [] s) {
        if (s == null || start >= end) {
            return;
        }
        char c = s[start];
        s[start] = s[end];
        s[end] = c;
        helper(start + 1, end-1, s);
    }
}
