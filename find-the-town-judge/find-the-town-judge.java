class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 1 & trust.length == 0) return 1;
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        for(int[] t: trust) {
            ArrayList l = new ArrayList<Integer>();
            hm.put(t[1], l);
        }
        for(int[] t: trust) {
            hm.put(t[0], null);
            if(hm.get(t[1]) == null) continue;
            ArrayList l = hm.get(t[1]);
            l.add(t[0]);
            hm.put(t[1], l);
        }
        for(int i: hm.keySet()) {
            if(hm.get(i) != null && hm.get(i).size() == n-1) return i;
        }
        return -1;
    }
}