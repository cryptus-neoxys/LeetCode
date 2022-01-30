class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        int oneCount=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                oneCount++;
            }
        }

        int maxDivisor = oneCount;
        List<Integer> result = new ArrayList<>();
        result.add(0);
        int runningCount = oneCount;//1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                runningCount++;
            } else if (nums[i] == 1) {
                runningCount--;
            }
            if (runningCount >= maxDivisor) {
                if(runningCount != maxDivisor) {
                    result.clear();
                    maxDivisor = runningCount;
                }
                result.add(i+1);
            }

        }

        return result;
    }
}