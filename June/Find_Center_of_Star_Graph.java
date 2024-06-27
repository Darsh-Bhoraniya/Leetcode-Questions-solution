public class Find_Center_of_Star_Graph {
    public int findCenter(int[][] edges) {
        int numberOfNodes = edges.length + 1;
       int[] nodeDegreeCount = new int[numberOfNodes + 1];

       // Iterate through each edge to count the degree of each node
       for (int[] edge : edges) {
           nodeDegreeCount[edge[0]]++;
           nodeDegreeCount[edge[1]]++;
       }

       // The center node will have a degree equal to number of edges
       for (int node = 1; node <= numberOfNodes; node++) {
           if (nodeDegreeCount[node] == edges.length) {
               return node;
           }
       }

       return -1; // In case no center is found, though it's guaranteed in a valid star graph
   }
}
