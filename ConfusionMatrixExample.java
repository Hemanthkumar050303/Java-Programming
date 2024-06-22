import java.util.Arrays;

public class ConfusionMatrixExample {
    public static void main(String[] args) {
        // Example predicted and actual classes (binary classification)
        int[] predicted = {1, 0, 1, 1, 0, 1, 0, 1, 1, 0};
        int[] actual =    {1, 0, 1, 0, 1, 0, 1, 1, 0, 1};

        // Compute confusion matrix
        int[][] confusionMatrix = computeConfusionMatrix(predicted, actual);
        
        // Print confusion matrix
        System.out.println("Confusion Matrix:");
        printMatrix(confusionMatrix);

        // Calculate TP, TN, FP, FN
        int tp = confusionMatrix[1][1];
        int tn = confusionMatrix[0][0];
        int fp = confusionMatrix[0][1];
        int fn = confusionMatrix[1][0];

        // Calculate precision, recall, and F1 score
        double precision = calculatePrecision(tp, fp);
        double recall = calculateRecall(tp, fn);
        double f1Score = calculateF1Score(precision, recall);

        // Print metrics
        System.out.println("\nMetrics:");
        System.out.println("True Positives (TP): " + tp);
        System.out.println("True Negatives (TN): " + tn);
        System.out.println("False Positives (FP): " + fp);
        System.out.println("False Negatives (FN): " + fn);
        System.out.println("Precision: " + precision);
        System.out.println("Recall: " + recall);
        System.out.println("F1 Score: " + f1Score);
    }

    // Method to compute confusion matrix
    public static int[][] computeConfusionMatrix(int[] predicted, int[] actual) {
        int[][] matrix = new int[2][2]; // Binary classification: 2x2 matrix

        for (int i = 0; i < predicted.length; i++) {
            if (actual[i] == 1 && predicted[i] == 1) {
                matrix[1][1]++; // True Positive
            } else if (actual[i] == 0 && predicted[i] == 0) {
                matrix[0][0]++; // True Negative
            } else if (actual[i] == 0 && predicted[i] == 1) {
                matrix[0][1]++; // False Positive
            } else if (actual[i] == 1 && predicted[i] == 0) {
                matrix[1][0]++; // False Negative
            }
        }

        return matrix;
    }

    // Method to calculate precision
    public static double calculatePrecision(int tp, int fp) {
        if (tp + fp == 0) {
            return 0.0;
        }
        return (double) tp / (tp + fp);
    }

    // Method to calculate recall
    public static double calculateRecall(int tp, int fn) {
        if (tp + fn == 0) {
            return 0.0;
        }
        return (double) tp / (tp + fn);
    }

    // Method to calculate F1 score
    public static double calculateF1Score(double precision, double recall) {
        if (precision + recall == 0) {
            return 0.0;
        }
        return 2 * (precision * recall) / (precision + recall);
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
