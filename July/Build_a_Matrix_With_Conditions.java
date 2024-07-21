import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Build_a_Matrix_With_Conditions {

    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        List<Integer> order1 = GenerateTopologicalSort(rowConditions, k);
        List<Integer> order2 = GenerateTopologicalSort(colConditions, k);
        if (order1.size() < k || order2.size() < k)
            return new int[0][0];
        Map<Integer, Integer> m = new HashMap();
        for (int i = 0; i < k; i++)
            m.put(order2.get(i), i);
        int[][] ans = new int[k][k];
        for (int i = 0; i < k; i++)
            ans[i][m.get(order1.get(i))] = order1.get(i);
        return ans;
    }

    private List<Integer> GenerateTopologicalSort(int[][] A, int k) {
        int[] deg = new int[k];
        List<Integer> order = new ArrayList();
        List<List<Integer>> graph = new ArrayList();
        for (int i = 0; i < k; i++)
            graph.add(new ArrayList());
        Queue<Integer> q = new LinkedList();
        for (int[] c : A) {
            graph.get(c[0] - 1).add(c[1] - 1);
            deg[c[1] - 1]++;
        }
        for (int i = 0; i < k; i++)
            if (deg[i] == 0)
                q.add(i);
        while (!q.isEmpty()) {
            int x = q.poll();
            order.add(x + 1);
            for (int y : graph.get(x))
                if (--deg[y] == 0)
                    q.add(y);
        }
        return order;
    }
}