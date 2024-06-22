public class ShiftValues {
    public static void main(String[] args) {
        int[] A = {5, 10, 15, 20, 25};
        int[] B = {3, 6, 9, 12, 15};
        
        int[] result = new int[A.length];
        
        if (A.length > B.length) {
            // Shift values from left to right
            for (int i = 0; i < B.length; i++) {
                result[i] = A[i];
            }
            for (int i = B.length; i < A.length; i++) {
                result[i] = 0; // Fill remaining with default value (0 in this case)
            }
        } else {
            // Shift values from right to left
            for (int i = 0; i < A.length; i++) {
                result[i] = B[i];
            }
            for (int i = A.length; i < B.length; i++) {
                result[i] = 0; // Fill remaining with default value (0 in this case)
            }
        }
        
        System.out.println("Result array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
