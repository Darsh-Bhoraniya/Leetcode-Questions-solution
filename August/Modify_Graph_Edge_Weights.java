public class Modify_Graph_Edge_Weights {
    public int[][] modifiedGraphEdges(int n, int[][] edges, int source, int destination, int target) {

        List<List<int[]>> adj = new ArrayList<>();
        List<int[]> negEdges = new ArrayList<>();
        int[][] res = new int[edges.length][3];
        int ri = 0;

        for (int i=0; i<n; i++)
            adj.add(new ArrayList<>());

        for(int[] e:edges){
            if (e[2]==-1){
                negEdges.add(e);
                continue;
            }
            adj.get(e[0]).add(new int[]{e[1], e[2]});
            adj.get(e[1]).add(new int[]{e[0], e[2]});
            res[ri++] = e;
        }

        int minWoMod = getMin(n, adj, source, destination);
        if (minWoMod<target) return new int[][]{};
        else if (minWoMod==target){
            for (int[] e:edges){
                if (e[2]==-1) e[2] = target;
            }
            return edges;
        }

        for (int i=0; i<negEdges.size(); i++){
            int[] e = negEdges.get(i);
            adj.get(e[0]).add(new int[]{e[1], 1});
            adj.get(e[1]).add(new int[]{e[0], 1});
            int min = getMin(n, adj, source, destination);
            if (min>target){
                res[ri++] = new int[]{e[0], e[1], 1};
            }else{
                res[ri++] = new int[]{e[0], e[1], 1+target-min};
                for (int j=i+1; j<negEdges.size(); j++)
                    res[ri++] = new int[]{negEdges.get(j)[0], negEdges.get(j)[1], target};
                return res;
            }
        }

        return new int[][]{};
    }

    private int getMin(int n, List<List<int[]>> adj, int source, int destination){

        boolean[] seen = new boolean[n];

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b)->a[1]-b[1]
        );

        pq.add(new int[]{source, 0});

        while(!pq.isEmpty()){
            int[] curr = pq.remove();
            if (seen[curr[0]]) continue;
            seen[curr[0]] = true;

            if (curr[0]==destination)
                return curr[1];

            for (int[] next:adj.get(curr[0])){
                if (seen[next[0]]) continue;
                pq.add(new int[]{next[0], next[1]+curr[1]});
            } 
        }

        return Integer.MAX_VALUE;
    }
}
