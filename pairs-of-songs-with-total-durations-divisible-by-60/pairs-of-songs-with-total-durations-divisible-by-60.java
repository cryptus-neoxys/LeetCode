class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int n = time.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i: time) {
            if(hm.get(i % 60) == null) hm.put(i % 60, 0);
            hm.put(i % 60, hm.get(i % 60) + 1);
        }
        int answer = 0;
        for(int i : hm.keySet()) {
            if(i == 30 || i == 0) answer += hm.get(i) * (hm.get(i) - 1);
            else if(hm.get(Math.abs(60 - i)) != null)
                answer += hm.get(i) * hm.get(Math.abs(60 - i));
        }
        
        return answer / 2;
    }
}