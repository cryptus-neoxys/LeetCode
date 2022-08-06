class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int totalTests = minutesToTest / minutesToDie;
        int i = 0;
        while(Math.pow(totalTests+1,i)< buckets){
            i++;
        }
        return i;
    }
}