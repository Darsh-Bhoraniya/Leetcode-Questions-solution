public class Find_if_Path_Exists_in_Graph { 
        public boolean validPath(int n, int[][] edges, int start, int end) {
            Map<Integer, List<Integer>> graph = new HashMap<>();
            
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                
                graph.putIfAbsent(u, new ArrayList<>());
                graph.putIfAbsent(v, new ArrayList<>());
                
                graph.get(u).add(v);
                graph.get(v).add(u);
            }
            
            Queue<Integer> queue = new LinkedList<>();
            Set<Integer> visited = new HashSet<>();
            
            queue.offer(start);
            visited.add(start);
            
            while (!queue.isEmpty()) {
                int node = queue.poll();
                
                if (node == end) {
                    return true;
                }
                
                for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                    if (!visited.contains(neighbor)) {
                        queue.offer(neighbor);
                        visited.add(neighbor);
                    }
                }
            }
            
            return false;
        }   
}
