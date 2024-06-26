import java.util.Arrays;

public class MatrixExample {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = i * cols + j + 1;
            }
        }
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
