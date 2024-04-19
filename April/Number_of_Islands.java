public class Number_of_Islands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0; // If the grid is empty, return 0
        
        int numIslands = 0; // Counter for the number of islands
        
        // Loop through each cell in the grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') { // If the cell contains land
                    numIslands++; // Increment the island count
                    exploreIsland(grid, i, j); // Explore the island
                }
            }
        }
        
        return numIslands; // Return the total number of islands
    }
    
    // Helper method to explore the island using depth-first search (DFS)
    private void exploreIsland(char[][] grid, int i, int j) {
        // Check if the current cell is within bounds and is land
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') return;
        
        grid[i][j] = '0'; // Mark the current cell as visited
        
        // Explore adjacent cells (up, down, left, right)
        exploreIsland(grid, i + 1, j); // Down
        exploreIsland(grid, i - 1, j); // Up
        exploreIsland(grid, i, j + 1); // Right
        exploreIsland(grid, i, j - 1); // Left
    }
}
