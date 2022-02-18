class Solution {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        if(len == k) return "0";
        if(k == 0) return num;
        
        int i = 0;
        Stack<Character> st = new Stack<>();
        while(i < len) {
            while(k > 0 && !st.isEmpty() && st.peek() > num.charAt(i)) {
                st.pop(); k--;
            }
            st.push(num.charAt(i)); i++;
        } while(k-- > 0) st.pop();
        
        String res = "";
        while(!st.isEmpty()) res = st.pop() + res;
        while(res.length() > 1 && res.charAt(0) == '0') res = res.substring(1);
        
        return res;
        
    }
}