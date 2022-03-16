class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        int N = pushed.length;
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for(int x: pushed) {
            st.push(x);
            while(!st.isEmpty() && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
        }
        
        return st.isEmpty();
    }
}