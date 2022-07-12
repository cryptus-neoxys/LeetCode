class Solution {
    public boolean makesquare(int[] matchsticks) {
        int n = matchsticks.length;
        if(n < 4) return false;
        int s = 0;
        for(int m: matchsticks) s += m;
        if(s % 4 != 0) return false;
        int[] lens = new int[4];
        // System.out.println("h");
        int side = s / 4;
        matchsticks = Arrays.stream(matchsticks).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        return dfs(matchsticks, 0, lens, side);
    }
    
    private boolean dfs(int [] M, int i, int[] lens, int s) {
        if(i == M.length) {
            return (lens[0] == s && lens[1] == s && lens[2] == s);
        }
        
        for(int k = 0; k < 4; ++k) {
            if(M[i] + lens[k] > s) continue;
            lens[k] += M[i];
            if(dfs(M, i+1, lens, s)) return true;
            lens[k] -= M[i];
        }
        
        return false;
    }
}