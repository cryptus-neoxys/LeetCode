class Solution {
    
    private static class Pair {
        Character c; Integer i;
        
        public Pair(char c, int i) {
            this.c = c;
            this.i = i;
        }
    }
    
    
    public String minRemoveToMakeValid(String s) {
        int N = s.length();

        boolean[] arr = new boolean[N];
        Stack<Pair> st = new Stack<>();
        
        for(int i = 0; i < N; ++i) {
            char c = s.charAt(i);
            if(c == '(') st.push(new Pair(c, i));
            else if(c == ')') {
                if(st.isEmpty() || st.peek().c != '(') {
                    continue;
                } else {
                    Pair t = st.pop();
                    arr[i] = true;
                    arr[t.i] = true;
                }
            }
            else arr[i] = true;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < N; ++i) {
            if(arr[i])
                sb.append(s.charAt(i));
        }
        
        
        return sb.toString();
    }
}