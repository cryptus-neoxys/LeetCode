class Solution {
    public String predictPartyVictory(String senate) {
        int r = 0, d = 0;
        int rs = 0, ds = 0;
        Queue<Character> q = new ArrayDeque<>();
        for(char c: senate.toCharArray()) {
            if(c == 'R') rs++;
            if(c == 'D') ds++;
            q.add(c);
        }
        while(!q.isEmpty()) {
            Character t = q.remove();
            if(t == 'R') {
                if(r == 0) {
                    d++;
                    if(ds > 0)ds--;
                    q.add(t);
                } else if(r > 0) r--;
            }
            else if(t == 'D') {
                if(d == 0) {
                    r++;
                    if(rs > 0)rs--;
                    q.add(t);
                } else if(d > 0) d--;
            }
            if(ds == 0 || rs == 0) break;
        }
        if(rs == 0) return "Dire";
        else return "Radiant";
    }
}