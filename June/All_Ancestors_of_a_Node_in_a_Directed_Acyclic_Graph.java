import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class All_Ancestors_of_a_Node_in_a_Directed_Acyclic_Graph {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
     // Step 1: Create a graph from the edge list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            graph.get(to).add(from);
        }
        
        // Step 2: Initialize the list to store the ancestors of each node
        List<Set<Integer>> ancestors = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ancestors.add(new HashSet<>());
        }
        
        // Step 3: Perform DFS for each node to find all ancestors
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n];
            dfs(i, i, graph, ancestors, visited);
        }
        
        // Step 4: Convert sets to sorted lists
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> ancestorList = new ArrayList<>(ancestors.get(i));
            Collections.sort(ancestorList);
            result.add(ancestorList);
        }
        
        return result;
    }
    
    private static void dfs(int start, int node, List<List<Integer>> graph, List<Set<Integer>> ancestors, boolean[] visited) {
        if (visited[node]) {
            return;
        }
        visited[node] = true;
        for (int ancestor : graph.get(node)) {
            ancestors.get(start).add(ancestor);
            dfs(start, ancestor, graph, ancestors, visited);
        }   
    }
}
