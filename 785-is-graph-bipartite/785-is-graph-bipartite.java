class Solution {
    public boolean isBipartite(int[][] graph) {
        int V = graph.length;
        int[] vis = new int[V];
        
        for(int i = 0; i < V; ++i) {
            if(vis[i] == 0) {
				Queue<Integer> q = new LinkedList<>();
				q.add(i);
				vis[i] = 1;
				
				while(!q.isEmpty()) {
					Integer node = q.poll();
					for(int it: graph[node]) {
						if(vis[it] == 0) {
							q.add(it);
							vis[it] = vis[node] == 1 ? -1 : 1;
						}
						if(vis[it] == vis[node]) return false;
					}
				}
			}
        }
        return true;
    }
}