// Given array of digits, return array of digits increased by one.
// [1,2,3] -> [1,2,4];   [9,9,9] -> [1,0,0,0]

class Solution {
    public int[] plusOne(int[] digits) {
        int k = digits.length-1;
        while(k >= 0) {
            if (digits[k] +1 == 10) {
                digits[k] = 0;
                k--;
            } else {
                digits[k] += 1;
                return digits;
            }
        }
        if(k == -1) {
            int[] upd = new int[digits.length+1];
            upd[0] = 1;
            return upd;
        }
        return digits;
    }
}
