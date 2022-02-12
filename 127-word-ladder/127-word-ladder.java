class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int len = beginWord.length();
        Set<String> set = new HashSet<>(wordList);
        Set<String> vis = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        vis.add(beginWord);
        int change = 1;
        while(!q.isEmpty()) {
            int s = q.size();
            
            while(s-- > 0) {
                String node = q.poll();
                if(node.equals(endWord)) return change;
                for(String it: set) {
                    // System.out.println(it);
                    // System.out.println("Vis: " + vis);
                    if(!vis.contains(it)) {
                        int diff = 0;
                        for(int i = 0; i < len; ++i) {
                            if(node.charAt(i) != it.charAt(i)) diff++;
                        }
                        // System.out.println(diff);
                        if(diff == 1) {
                            // if(it.equals(endWord)) return change;
                            q.add(it); vis.add(it);
                        }
                    }
                }
                // System.out.println("Queue: " + q);
            }
            change++;
        }
        return 0;
    }
}