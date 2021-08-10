class Solution {
public:
    int addDigits(int num) {
        if(!(num / 10)) return num;
        int s = 0;
        while(num) {
            s += num % 10;
            num /= 10;
        }
        return addDigits(s);
    }
};