class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
        // sort by start time, else wider intervals first -> [1,4], [1,3], [2, 4]
        Arrays.sort(
            intervals,
            (int[] a, int[] b) -> a[0] - b[0] != 0 ? a[0] - b[0] : b[1] - a[1]
        );
        
        
        int l = intervals[0][0], r = intervals[0][1];
        int covered = 0;
        
        for(int i = 1; i < intervals.length; ++i) {
            if(l <= intervals[i][0] && r >= intervals[i][1]) {
                covered++;
            } else {
                l = intervals[i][0]; r = intervals[i][1];
            }
        }
        
        
        return intervals.length - covered;
    }
}