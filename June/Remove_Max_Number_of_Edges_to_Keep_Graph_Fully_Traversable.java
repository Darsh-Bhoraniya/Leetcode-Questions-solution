import java.util.Arrays;

public class Remove_Max_Number_of_Edges_to_Keep_Graph_Fully_Traversable {
 public int maxNumEdgesToRemove(int n, int[][] edges) {
        UnionFind Alice = new UnionFind(n);
        UnionFind Bob = new UnionFind(n);
        int count = 0;

        Arrays.sort(edges, (e1, e2) -> e2[0] - e1[0]);
        for (int[] edge : edges) {
            switch(edge[0]) {
                case 1:
                    if(Alice.union(edge[1] - 1, edge[2]-1))
                        count++;
                    break;
                
                case 2:
                    if (Bob.union(edge[1]- 1, edge[2] - 1)) 
                        count++;
                    break;

                case 3:
                    boolean a = Alice.union(edge[1] - 1, edge[2] - 1);
                    boolean b = Bob.union(edge[1] - 1, edge[2] -1);
                    if (a || b) 
                        count++;
                    break;
            }
        }
        if (Alice.united() && Bob.united()) {
            return edges.length - count;
        }
        return -1;
    }
}   

class UnionFind {
    int size;
    int[] arr;

    public UnionFind(int n) {
        size = n;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
    }

    boolean united() {
        return size == 1;
    }

    boolean union(int a, int b) {
        if (find(a) != find(b)) {
            arr[find(a)] = find(b);
            size--;
            return true;
        }
        return false;
    }

    int find(int a) {
        if (a != arr[a]) {
            arr[a] = find(arr[a]);
        }
        return arr[a];
    }   
}
