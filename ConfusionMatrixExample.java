import java.util.Arrays;

public class ConfusionMatrixExample {
    public static void main(String[] args) {
        int[] predicted = {1, 0, 1, 1, 0, 1, 0, 1, 1, 0};
        int[] actual =    {1, 0, 1, 0, 1, 0, 1, 1, 0, 1};
        int[][] confusionMatrix = computeConfusionMatrix(predicted, actual);
        System.out.println("Confusion Matrix:");
        printMatrix(confusionMatrix);
        int tp = confusionMatrix[1][1];
        int tn = confusionMatrix[0][0];
        int fp = confusionMatrix[0][1];
        int fn = confusionMatrix[1][0];
        double precision = calculatePrecision(tp, fp);
        double recall = calculateRecall(tp, fn);
        double f1Score = calculateF1Score(precision, recall);

        System.out.println("\nMetrics:");
        System.out.println("True Positives (TP): " + tp);
        System.out.println("True Negatives (TN): " + tn);
        System.out.println("False Positives (FP): " + fp);
        System.out.println("False Negatives (FN): " + fn);
        System.out.println("Precision: " + precision);
        System.out.println("Recall: " + recall);
        System.out.println("F1 Score: " + f1Score);
    }
    public static int[][] computeConfusionMatrix(int[] predicted, int[] actual) {
        int[][] matrix = new int[2][2];
        for (int i = 0; i < predicted.length; i++) {
            if (actual[i] == 1 && predicted[i] == 1) {
                matrix[1][1]++; // True Positive
            } else if (actual[i] == 0 && predicted[i] == 0) {
                matrix[0][0]++; // True Negative
            } else if (actual[i] == 0 && predicted[i] == 1) {
                matrix[0][1]++; // False Positive
            } else if (actual[i] == 1 && predicted[i] == 0) {
                matrix[1][0]++;
            }
        }
        return matrix;
    }
    public static double calculatePrecision(int tp, int fp) {
        if (tp + fp == 0) {
            return 0.0;
        }
        return (double) tp / (tp + fp);
    }
    public static double calculateRecall(int tp, int fn) {
        if (tp + fn == 0) {
            return 0.0;
        }
        return (double) tp / (tp + fn);
    }
    public static double calculateF1Score(double precision, double recall) {
        if (precision + recall == 0) {
            return 0.0;
        }
        return 2 * (precision * recall) / (precision + recall);
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
