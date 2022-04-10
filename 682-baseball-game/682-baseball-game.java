class Solution {
    public int calPoints(String[] ops) {
        Deque<String> st = new ArrayDeque();
        
        for(int i = 0; i < ops.length; ++i) {
            // System.out.println(ops[i] + ": " + st);
        
            if(ops[i].equals("+")) {
                int t = Integer.parseInt(st.pop(), 10);
                int tm1 = Integer.parseInt(st.pop(), 10);
                st.push("" + (tm1));
                st.push("" + (t));
                st.push("" + (t + tm1));
            }
            
            else if(ops[i].equals("D")) {
                int t = Integer.parseInt(st.pop());
                st.push("" + t);
                st.push("" + (2 * t));
            }
            
            else if(ops[i].equals("C")) {
                st.pop();
            }
            
            else st.push(ops[i]);
        }
        
        int res = 0;
        while(st.size() != 0) {
            res += Integer.parseInt(st.pop());
        }
        
        return res;
    }
}