class Solution {
    public int maxChunksToSorted(int[] arr) {        
        Stack<Integer> st = new Stack<>();
        for(int num: arr) {
            int largest = num;
            while(st.size() > 0 && st.peek() > num) {
                largest = Math.max(largest, st.pop());
            }
            st.push(largest);
            // // _DEBUG
            // System.out.println(st);
        }
        return st.size();
    }
}