class Solution {
    public int maxArea(int h, int w, int[] hc, int[] vc) {
        int hcN = hc.length, vcN = vc.length;
        Arrays.sort(hc);
        Arrays.sort(vc);
        
        int maxH = Math.max(hc[0] - 0, h - hc[hcN - 1]);
        int maxW = Math.max(vc[0] - 0, w - vc[vcN - 1]);
        
        for(int i = 1; i < hcN; ++i) maxH = Math.max(maxH, hc[i] - hc[i-1]);
        for(int i = 1; i < vcN; ++i) maxW = Math.max(maxW, vc[i] - vc[i-1]);
        
        return (int)((long)maxH * maxW % 1000000007);
    }
}