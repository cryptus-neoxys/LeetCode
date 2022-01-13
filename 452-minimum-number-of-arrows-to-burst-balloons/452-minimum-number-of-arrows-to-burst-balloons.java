class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (int[] a, int[] b) -> Integer.compare(a[1], b[1]));
        
        int count = 1, end = points[0][1];
        
        
        // // _DEBUG
        // for(int[] p: points) {
        //     System.out.println(p[0] + " " + p[1]);
        // }
        
        for(int i = 1; i < points.length; ++i) {
            if(points[i][0] <= end) {
                continue;
            } else {
                end = points[i][1];
                count++;
            }
        }
        
        return count;
    }
}