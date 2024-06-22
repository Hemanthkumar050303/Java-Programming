public class MatrixExample {
    public static void main(String[] args) {
        // Define size of matrices
        int rows = 3;
        int cols = 3;
        
        // Matrix A (1 to 9 loop)
        int[][] matrixA = new int[rows][cols];
        int counterA = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = counterA;
                counterA++;
            }
        }
        
        // Matrix B (9 to 1 loop)
        int[][] matrixB = new int[rows][cols];
        int counterB = 9;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = counterB;
                counterB--;
            }
        }
        
        // Print Matrix A
        System.out.println("Matrix A (1 to 9):");
        printMatrix(matrixA);
        
        // Print Matrix B
        System.out.println("\nMatrix B (9 to 1):");
        printMatrix(matrixB);
    }
    
    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
