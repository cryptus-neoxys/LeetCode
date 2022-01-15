class Solution {
    public int myAtoi(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int answer = 0;
        int pointer = 0;
        int sign = 1;
        
        while(pointer < n && arr[pointer] == ' ') pointer++;
        
        if(pointer < n && arr[pointer] == '+') {
            sign = 1;
            pointer++;
        } else if (pointer < n && arr[pointer] == '-') {
            sign = -1;
            pointer++;
        }
        
        
        while(pointer < n && arr[pointer] >= '0' && arr[pointer] <= '9') {
            int digit = arr[pointer] - '0';
            
            if (
                (answer > Integer.MAX_VALUE / 10) || 
                (answer == Integer.MAX_VALUE / 10 && 
                 digit > Integer.MAX_VALUE % 10)
            ) {         
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            answer = 10 * answer + digit;
            pointer++;
        }
        
        return sign * answer;
    }
}