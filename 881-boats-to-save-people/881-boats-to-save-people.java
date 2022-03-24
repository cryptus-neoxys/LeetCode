class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0, h = people.length - 1;
        int res = 0;
        while(l <= h) {
            if(people[l] + people[h] <= limit) {
                l++; h--;
            } else {
                h--;
            }
            res++;
        }
        return res;
    }
}