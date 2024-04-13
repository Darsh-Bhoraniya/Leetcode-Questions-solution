public class Maximal_Rectangle{
    public int maximalRectangle(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        // Include an extra element for easier calculation
        int[] heights = new int[cols + 1]; 
        int maxArea = 0;
        
        for (char[] row : matrix) {
            for (int i = 0; i < cols; i++) {
                heights[i] = (row[i] == '1') ? heights[i] + 1 : 0;
            }
            
            // Calculate max area using histogram method
            int n = heights.length; // Number of bars in the histogram
           
            for (int i = 0; i < n; i++) {
                int minHeight = Integer.MAX_VALUE;
                for (int j = i ; j < n; j++) {         
                    minHeight = Math.min(minHeight, heights[j]);
                    int area = minHeight * (j - i + 1);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        
        return maxArea;
    }
}