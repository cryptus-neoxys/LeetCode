class Solution {
    
    private boolean isBiPartite(ArrayList<ArrayList<Integer>> adjList) {
		int V = adjList.size() - 1;
		int[] vis = new int[V + 1];
		
		for(int i = 1; i <= V; ++i) {
			if(vis[i] == 0) {
				Queue<Integer> q = new LinkedList<>();
				q.add(i);
				vis[i] = 1;
				
				while(!q.isEmpty()) {
					Integer node = q.poll();
					for(Integer it: adjList.get(node)) {
						if(vis[it] == 0) {
							q.add(it);
							vis[it] = vis[node] == 1 ? -1 : 1;
						}
						if(vis[it] == vis[node]) return false;
					}
				}
			}
		}
		// System.out.println(Arrays.toString(vis));
		return true;
	}
    
    public boolean possibleBipartition(int V, int[][] dislikes) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        
        for(int i = 0; i <= V; ++i) adjList.add(new ArrayList<Integer>());
        
        for(int i = 0; i < dislikes.length; ++i) {
            adjList.get(dislikes[i][0]).add(dislikes[i][1]);
            adjList.get(dislikes[i][1]).add(dislikes[i][0]);
        }
        
		// // _DEBUG
		// System.out.println("Graph");
		// for (int i = 1; i <= V; ++i) {
		// 	System.out.print(i + "-> ");
		// 	for (int j = 0; j < adjList.get(i).size(); ++j) {
		// 		System.out.print(adjList.get(i).get(j) + " ");
		// 	}
		// 	System.out.print("\n");
		// }
        
        return isBiPartite(adjList);
    }
}