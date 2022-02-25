class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1S = version1.split("\\.");
        String[] v2S = version2.split("\\.");
        
        int t = v1S.length - 1;
        while(t > 0 && Integer.parseInt(v1S[t]) == 0) t--;
        int[] v1 = new int[t+1];
        for(int i = 0; i <= t; ++i) v1[i] = Integer.parseInt(v1S[i]);

        t = v2S.length - 1;
        while(t > 0 && Integer.parseInt(v2S[t]) == 0) t--;
        int[] v2 = new int[t+1];
        for(int i = 0; i <= t; ++i) v2[i] = Integer.parseInt(v2S[i]);
        
        
        for(int i = 0; i < Math.min(v1.length, v2.length); ++i) {
            if(v1[i] != v2[i]) return v1[i] > v2[i] ? 1 : -1;
        }
        
        if(v1.length != v2.length) return v1.length > v2.length ? 1 : -1;
        return 0;
    }
}