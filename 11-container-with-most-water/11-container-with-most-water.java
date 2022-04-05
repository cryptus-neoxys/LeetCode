class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0, r = n - 1;
        int area = 0;
        while(l < r) {
            if(height[l] <= height[r]) {
                area = Math.max(area, height[l] * (r - l));
                l++;
            } else {
                area = Math.max(area, height[r] * (r - l));
                r--;
            }
        }
        
        return area;
    }
}