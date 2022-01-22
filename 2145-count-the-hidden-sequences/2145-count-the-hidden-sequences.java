class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int N = differences.length;
        
        // int[] hidden = new int[N + 1];
        
        int hidden = 0;
        int minIndex = 0;
        int maxIndex = 0;
        
        for(int i = 0; i < N; ++i) {
            hidden = hidden + differences[i];
            if(hidden > maxIndex) maxIndex = hidden;
            if(hidden < minIndex) minIndex = hidden;
        }
        
        // // _DEBUG
        // for(int x: hidden) System.out.print(x + " ");
        // System.out.print("\n");
        // System.out.println("lower = " + lower + " hM = " +  upper);
        // System.out.println("hm = " + hidden[minIndex] + " hM = " +  hidden[maxIndex]);
        // System.out.print("\n");
        
        if(Math.abs(maxIndex - minIndex) > Math.abs(upper - lower)) return 0;
        return (Math.abs(Math.abs(lower - upper) - Math.abs(maxIndex - minIndex)) + 1);
        
        // return 0;
    }
}