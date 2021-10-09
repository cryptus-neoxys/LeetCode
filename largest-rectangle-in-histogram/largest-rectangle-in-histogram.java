class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] rb = new int[n]; // nse index to right
        Stack< Integer> st = new Stack<>();
        st.push(n - 1);
        rb[n - 1] = n;

        for(int i = n-2; i >= 0; --i) {
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]) st.pop();

            if(st.isEmpty()) rb[i] = n;
            else rb[i] = st.peek();
            st.push(i);
        }

        int[] lb = new int[n]; // nse index to left

        st = new Stack<>();
        st.push(0);
        lb[0] = -1;

        for(int i = 1; i < n; ++i) {
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]) st.pop();

            if(st.isEmpty()) lb[i] = -1;
            else lb[i] = st.peek();
            st.push(i);
        }
        // _DEBUS
        {
            // for(int i = 0; i < n; ++i)
            //     System.out.println("a[i] = " + arr[i] +" lb[i] = " + lb[i] + " rb[i] = " + rb[i]);
        }

        int res = 0;
        for(int i = 0; i < n; ++i) {
            int w = rb[i] - lb[i] - 1;
            int area = arr[i] * w;
            res = Math.max(res, area);
        }

        return(res);
    }
}