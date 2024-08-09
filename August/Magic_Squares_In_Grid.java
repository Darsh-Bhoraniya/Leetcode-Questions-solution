public class Magic_Squares_In_Grid {
    private int rows;
    private int cols;
    private int[][] grid;

    // Method for finding the number of magic squares inside the given grid
    public int numMagicSquaresInside(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        this.grid = grid;
        int count = 0;
      
        // Iterate over all possible 3x3 sub-grids
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                count += checkMagicSquare(i, j);
            }
        }
        return count;
    }

    // Helper method to check if the 3x3 sub-grid starting at (i, j) is a magic square
    private int checkMagicSquare(int i, int j) {
        // Check if the sub-grid exceeds the boundary of the grid
        if (i + 3 > rows || j + 3 > cols) {
            return 0;
        }

        // Check uniqueness of numbers and calculate sums of rows, columns, and diagonals
        int[] frequency = new int[16];
        int[] rowSum = new int[3];
        int[] colSum = new int[3];
        int diagonalSum = 0, antiDiagonalSum = 0;
        for (int x = i; x < i + 3; ++x) {
            for (int y = j; y < j + 3; ++y) {
                int value = grid[x][y];
                // Check if the value is in the 1-9 range and its uniqueness within the sub-grid
                if (value < 1 || value > 9 || ++frequency[value] > 1) {
                    return 0;
                }
                rowSum[x - i] += value;
                colSum[y - j] += value;
                // Diagonal sum
                if (x - i == y - j) {
                    diagonalSum += value;
                }
                // Anti-diagonal sum
                if (x - i + y - j == 2) {
                    antiDiagonalSum += value;
                }
            }
        }

        // Check if the diagonal sums are equal
        if (diagonalSum != antiDiagonalSum) {
            return 0;
        }

        // Check if each row and column sums up to the value of the diagonal sum
        for (int k = 0; k < 3; ++k) {
            if (rowSum[k] != diagonalSum || colSum[k] != diagonalSum) {
                return 0;
            }
        }

        // The grid is a magic square if all checks pass
        return 1;
    }
}
