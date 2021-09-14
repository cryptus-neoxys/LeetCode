class Solution {
    public int numSpecial(int[][] mat) {
        int[] y = new int[mat.length], x = new int[mat[0].length];
        
        for(int i = 0; i < y.length; i++)
            for(int j = 0; j < x.length; j++) {
                if(mat[i][j] == 1) {
                    y[i]++; x[j]++;
                }
            }
        int res = 0;
        for(int i = 0; i < y.length; i++) {
            for(int j = 0; j < x.length; j++) {
                // DEBUG
                System.out.print(y[i] + " " + x[j] + ", ");
                if(y[i] == 1 && x[j] == 1 && mat[i][j] == 1) {
                    res++;
                }
            }
            // DEBUG
            // System.out.println();
        }
        return res;
    }
}