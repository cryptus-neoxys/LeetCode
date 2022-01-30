class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        int N = nums.length;
        List<Integer> res = new ArrayList<>();
        
		// create the prefix array
        int[] pref = new int[N + 1];
        pref[0] = 0;
        for(int i = 0; i < N; ++i) pref[i+1] = nums[i] + pref[i];
        
		// initialise score to -1
        int maxScore = -1;
        for(int i = 0; i < N + 1; ++i) {
		
            int onesToRight = pref[N] - pref[i];
            int zeroesToLeft = i - pref[i];
            int currScore = zeroesToLeft + onesToRight;
            
			// current score = zeroesToLeft + onesToRight
            if(currScore > maxScore) {
				// reset result
                res.clear();
				// set score
                maxScore = currScore;
            }
			
            if(currScore == maxScore) res.add(i);                        
        }
        return res;
    }
}