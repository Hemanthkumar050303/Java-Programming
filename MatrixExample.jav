import java.util.Arrays;

public class MatrixExample {
    public static void main(String[] args) {
        // Define dimensions of the matrix
        int rows = 3;
        int cols = 4;

        // Create a 2D matrix using Arrays class
        int[][] matrix = new int[rows][cols];

        // Populate the matrix with values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Example: Fill matrix with sequential numbers
                matrix[i][j] = i * cols + j + 1;
            }
        }

        // Print the matrix using Arrays.toString for each row
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
