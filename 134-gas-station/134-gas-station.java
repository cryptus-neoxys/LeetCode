class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int N = gas.length;
        int[] compute = new int[N];
        int s = 0;
        for(int i = 0; i < N; ++i) {
            compute[i] = gas[i] - cost[i];
            s += compute[i];
        }
        // // _DEBUG
        // for(int c: compute) System.out.print(c + " ");
        // System.out.println();
        
        if(s < 0) return -1;
        s = 0;
        int res = 0;
        for(int i = 0; i < N; ++i) {
            s += compute[i];
            
            if(s < 0) {
                s = 0;
                res = i + 1;
            }
        }
        
        
        return res;
    }
}