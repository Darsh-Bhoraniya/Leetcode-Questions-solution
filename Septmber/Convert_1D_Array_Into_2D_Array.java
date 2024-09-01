public class Convert_1D_Array_Into_2D_Array {
    public int[][] construct2DArray(int[] original, int m, int n) {
        // Check if it is possible to form an m x n 2D array
        if (m * n != original.length) {
            // If not, return an empty 2D array
            return new int[0][0];
        }
        int resultArray[][] = new int[m][n];

        int crr = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Assign the current element from original array to the 2D array
                resultArray[i][j] = original[crr];
                // Move to the next element in the original array
                crr++;
            }
        }

        return resultArray;
    }
}
