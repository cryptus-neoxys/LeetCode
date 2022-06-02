class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] tp = new int[n][m];
        for(int i = 0; i < m; ++i)
            for(int j = 0; j < n; ++j)
                tp[j][i] = matrix[i][j];
        return tp;
    }
}