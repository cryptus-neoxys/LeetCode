class Solution {
    public int maximum69Number (int num) {
        int e = -1;
        int d = num;
        int p = 0;
        while(d != 0) {
            int lastDigit = d % 10;
            if(lastDigit == 6) {
                e = p;
            }
            d = d/10;p++;
        }
        if(e != -1) {
            num += 3 * Math.pow(10, (e));
        }
        return num;
    }
}


// index  // 3  2  1  0
// number // 9  6  9  9
// add = 3 * (10 ^ e)      |             
// e = 3